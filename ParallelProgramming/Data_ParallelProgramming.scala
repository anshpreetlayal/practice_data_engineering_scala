import scala.collection.parallel.CollectionConverters._
import scala.collection.mutable.HashMap

object ParallelAbstractionsExample {
  def main(args: Array[String]): Unit = {
    // Using parallel collections with data parallel abstractions
    val numbers = (1 to 10).toList.par

    // Using iterators
    val iterator = numbers.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    // Using splitters
    val splitter = numbers.spliterator
    val (left, right) = splitter.splitAt(5)
    println(left.toList) // [1, 2, 3, 4, 5]
    println(right.toList) // [6, 7, 8, 9, 10]

    // Using builders
    val builder = List.newBuilder[Int]
    builder += 1
    builder += 2
    val result = builder.result()
    println(result) // [1, 2]

    // Using combiners
    val words = List("hello", "world", "scala", "parallelism")
    val lengths = words.par.map(_.length)
    val totalLength = lengths.combiner.combineAll(lengths)
    println(totalLength) // 31

    // Two-phase construction for arrays
    val array = new Array  // Phase 1: Allocate the array

    // Phase 2: Populate the array in parallel
    array.par.indices.foreach { i =>
      array(i) = i * i
    }

    // Two-phase construction for hash tables
    val hashMap = new HashMap[Int, String]() // Phase 1: Create an empty hash map

    // Phase 2: Insert key-value pairs in parallel
    (1 to 100).par.foreach { i =>
      hashMap.put(i, s"Value $i")
    }

    // Conc-tree example
    sealed trait Conc[T]
    case object Empty extends Conc[Nothing]
    case class Single[T](value: T) extends Conc[T]
    case class Concat[T](left: Conc[T], right: Conc[T]) extends Conc[T]

    val concTree = Concat(Single(1), Concat(Single(2), Single(3)))

    // Conc-tree combiner
    def combineConcTrees(tree1: Conc[Int], tree2: Conc[Int]): Conc[Int] = (tree1, tree2) match {
      case (Empty, _) => tree2
      case (_, Empty) => tree1
      case (Single(v1), Single(v2)) => Concat(Single(v1), Single(v2))
      case (Concat(l1, r1), Concat(l2, r2)) => Concat(combineConcTrees(l1, l2), combineConcTrees(r1, r2))
    }

    val mergedConcTree = combineConcTrees(concTree, Single(4))
    println(mergedConcTree) // Concat(Single(1), Concat(Single(2), Concat(Single(3), Single(4))))
  }
}
