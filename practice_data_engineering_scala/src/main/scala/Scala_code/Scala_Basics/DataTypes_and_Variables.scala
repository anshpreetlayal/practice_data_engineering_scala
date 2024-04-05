object DataTypesVariablesExample extends App {
  // Type inference
  val x = 42 // Scala infers x as an Int
  val y: Double = 3.14 // Explicitly specify y as a Double

  // Different data types
  val name: String = "Alice" // String data type for storing name
  val age: Int = 30 // Int data type for storing age
  val isStudent: Boolean = true // Boolean data type for storing student status

  // Variables
  var mutableVar: Int = 10 // Mutable variable initialized to 10
  mutableVar = 20 // Mutable variable reassigned to 20

  val immutableVar: Int = 100 // Immutable variable initialized to 100
  // immutableVar = 200 // Error: Cannot reassign immutable variable

  // Printing values
  println(s"x: $x") // Output: x: 42
  println(s"y: $y") // Output: y: 3.14
  println(s"name: $name") // Output: name: Alice
  println(s"age: $age") // Output: age: 30
  println(s"isStudent: $isStudent") // Output: isStudent: true
  println(s"mutableVar: $mutableVar") // Output: mutableVar: 20
  println(s"immutableVar: $immutableVar") // Output: immutableVar: 100
}
