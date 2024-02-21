object CollectionsIterationsExample extends App {
  // List
  val numbersList = List(1, 2, 3, 4, 5)
  println("List:")
  numbersList.foreach(println) // Iterating over a list

  // Set
  val uniqueNumbersSet = Set(1, 2, 3, 4, 5, 5, 4, 3, 2, 1)
  println("\nSet:")
  uniqueNumbersSet.foreach(println) // Iterating over a set

  // Map
  val numberNamesMap = Map(1 -> "one", 2 -> "two", 3 -> "three")
  println("\nMap:")
  numberNamesMap.foreach { case (key, value) => println(s"Key: $key, Value: $value") } // Iterating over a map

  // Array
  val numbersArray = Array(1, 2, 3, 4, 5)
  println("\nArray:")
  numbersArray.foreach(println) // Iterating over an array
}

object CollectionsIterationsExample2 extends App {
  // Lists
  val list = List(1, 2, 3, 4, 5)
  println("List:")
  list.foreach(println) // Iterating over a list

  // List constructors
  val emptyList = Nil // Empty list
  val filledList = 1 :: 2 :: 3 :: Nil // Constructing a list

  // Right associativity
  val rightAssociativeList = 1 :: 2 :: 3 :: Nil // Same as 1 :: (2 :: (3 :: Nil))

  // List operations
  val sum = list.sum // Sum of elements in the list
  val reversed = list.reverse // Reversed list
  val filtered = list.filter(_ % 2 == 0) // Filter even numbers

  // List pattern matching
  list match {
    case head :: tail => println(s"Head: $head, Tail: $tail") // Matching head and tail
    case Nil => println("Empty list") // Matching empty list
  }

}