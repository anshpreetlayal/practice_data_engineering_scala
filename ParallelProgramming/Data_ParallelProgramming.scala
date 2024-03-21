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

   
  }
}
