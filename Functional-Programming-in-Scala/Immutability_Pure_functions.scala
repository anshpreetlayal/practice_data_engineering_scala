object ImmutabilityPureFunctionsExample extends App {
  // Immutability
  val immutableList = List(1, 2, 3, 4, 5)
  // immutableList :+ 6 // Error: Cannot modify immutable list

  // Pure Functions
  def add(x: Int, y: Int): Int = x + y // Pure function that adds two numbers

  // Impure Function (Example with side effects)
  var total = 0
  def addToTotal(x: Int): Int = {
    total += x // Side effect: Modifying external state
    total
  }

  // Using pure functions
  val sum = add(3, 4) // Using the pure add function
  println(s"Sum: $sum")

  // Using impure function
  val currentTotal = addToTotal(10) // Modifies external state
  println(s"Current Total: $currentTotal")
}

