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
