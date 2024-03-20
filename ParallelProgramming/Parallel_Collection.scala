// Accessor Combinators Example
object AccessorCombinatorsExample {
  def main(args: Array[String]): Unit = {
    // Map, Filter, and FlatMap Example
    val numbers = List(1, 2, 3, 4, 5)

    // Map: Square each number
    val squared = numbers.map(x => x * x)
    println("Squared numbers: " + squared)

    // Filter: Select even numbers
    val evenNumbers = numbers.filter(x => x % 2 == 0)
    println("Even numbers: " + evenNumbers)

    // FlatMap: Flatten nested list
    val nestedNumbers = List(List(1, 2), List(3, 4), List(5, 6))
    val flattened = nestedNumbers.flatMap(x => x)
    println("Flattened list: " + flattened)
  }
}


// Transformative Combinators Example
object TransformativeCombinatorsExample {
  def main(args: Array[String]): Unit = {
    // SortBy, GroupBy, and FoldLeft Example
    val names = List("Alice", "Bob", "Charlie")
    val numbers = List(1, 2, 3, 4, 5)

    // SortBy: Sort names by length
    val sortedNames = names.sortBy(name => name.length)
    println("Sorted names: " + sortedNames)

    // GroupBy: Group numbers by even/odd
    val groupedNumbers = numbers.groupBy(num => num % 2 == 0)
    println("Grouped numbers: " + groupedNumbers)

    // FoldLeft: Calculate sum of numbers
    val sum = numbers.foldLeft(0)((acc, x) => acc + x)
    println("Sum of numbers: " + sum)
  }
}

// Parallelizable Collections Example
object ParallelCollectionsExample {
  import scala.collection.parallel.CollectionConverters._

  def main(args: Array[String]): Unit = {
    // Parallelizable Collections Example
    val numbers = (1 to 1000000).toArray
    val parallelArray = numbers.par // Convert array to parallel collection
    val sum = parallelArray.fold(0)(_ + _) // Perform parallel fold operation
    println("Sum using parallel collection: " + sum)
  }
}

// Non-Parallelizable Collections Example
object NonParallelCollectionsExample {
  def main(args: Array[String]): Unit = {
    // Non-Parallelizable Collections Example
    val list = List(1, 2, 3, 4, 5)
    val sum = list.fold(0)(_ + _) // Sequential fold operation
    println("Sum using non-parallel collection: " + sum)
  }
}
