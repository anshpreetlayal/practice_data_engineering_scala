object CombinatorExample {
  def main(args: Array[String]): Unit = {
    // Accessor Combinators

    // Using map to square numbers
    val numbers = List(1, 2, 3, 4, 5)
    val squared = numbers.map(x => x * x)
    println("Squared numbers: " + squared)

    // Using filter to select even numbers
    val evenNumbers = numbers.filter(x => x % 2 == 0)
    println("Even numbers: " + evenNumbers)

    // Using flatMap to flatten nested lists
    val nestedNumbers = List(List(1, 2), List(3, 4), List(5, 6))
    val flattened = nestedNumbers.flatMap(x => x)
    println("Flattened list: " + flattened)

    // Transformative Combinators

    // Using sortBy to sort names by length
    val names = List("Alice", "Bob", "Charlie")
    val sortedNames = names.sortBy(name => name.length)
    println("Sorted names: " + sortedNames)

    // Using groupBy to group words by length
    val words = List("apple", "banana", "cherry", "avocado")
    val groupedByLength = words.groupBy(word => word.length)
    println("Grouped by length: " + groupedByLength)

    // Using foldLeft to calculate sum of numbers
    val sum = numbers.foldLeft(0)((acc, x) => acc + x)
    println("Sum of numbers: " + sum)
  }
}
