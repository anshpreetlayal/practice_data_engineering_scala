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
