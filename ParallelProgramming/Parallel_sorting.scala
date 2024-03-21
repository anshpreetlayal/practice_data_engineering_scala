object ParallelSortingExample {
  def main(args: Array[String]): Unit = {
    // Parallel sorting with ParArray
    val numbers = Array(5, 3, 1, 4, 2).par
    val sortedNumbers = numbers.toList.sorted
    println("Sorted numbers:", sortedNumbers)

    // Associativity example with addition
    val a = 1
    val b = 2
    val c = 3
    val assocResult1 = (a + b) + c
    val assocResult2 = a + (b + c)
    println("Associativity result 1:", assocResult1) // Should be 6
    println("Associativity result 2:", assocResult2) // Should also be 6

    // Commutativity example with multiplication
    val x = 2
    val y = 3
    val commutResult1 = x * y
    val commutResult2 = y * x
    println("Commutativity result 1:", commutResult1) // Should be 6
    println("Commutativity result 2:", commutResult2) // Should also be 6
  }
}
