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

   // Pure data (Algebraic data types)
  sealed trait Tree[A]
  case class Leaf[A](value: A) extends Tree[A]
  case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]

  val tree: Tree[Int] = Branch(Branch(Leaf(1), Leaf(2)), Leaf(3))

  // Enums (domain modeling)
  sealed trait DayOfWeek
  case object Monday extends DayOfWeek
  case object Tuesday extends DayOfWeek
  // ... Define other days

  val today: DayOfWeek = Monday

  // Subtyping, generics, bounds, variance
  trait Animal
  class Dog extends Animal
  class Cat extends Animal

  class Cage[A <: Animal](animal: A) // Using type bounds

  val dogCage = new Cage(new Dog)
  // val stringCage = new Cage("not an animal") // Error: String does not conform to type bound

 // Liskov substitution principle
  def printAnimalName(animal: Animal): Unit = println(animal.getClass.getSimpleName)

  val animal: Animal = new Dog
  printAnimalName(animal)

  // Pair, Tuples and generic methods
  val pair: (Int, String) = (1, "one")
  val triple: (Int, String, Boolean) = (1, "one", true)

  def printTuple[T1, T2](tuple: (T1, T2)): Unit = println(s"First: ${tuple._1}, Second: ${tuple._2}")

  printTuple(pair)
  printTuple(triple)

  // Higher-order list functions
  val mappedList = list.map(_ * 2) // Multiply each element by 2
  val filteredList = list.filter(_ % 2 == 0) // Filter even numbers
  val sumOfSquares = list.map(x => x * x).sum // Sum of squares of elements

  // Reduction of lists
  val reduceLeftResult = list.reduceLeft(_ + _) // Reduce left
  val foldLeftResult = list.foldLeft(0)(_ + _) // Fold left with initial value

  println(s"ReduceLeft result: $reduceLeftResult")
  println(s"FoldLeft result: $foldLeftResult")

 // Sequences, Vector, range
  val seq: Seq[Int] = Seq(1, 2, 3)
  val vector: Vector[Int] = Vector(1, 2, 3)
  val range: Range = 1 to 5

  // Combinatorial search
  val combinations = for {
    x <- Seq(1, 2)
    y <- Seq('a', 'b')
  } yield (x, y)

  println("Combinations:")
  combinations.foreach(println)

  // For expressions
  val forResult = for {
    x <- List(1, 2, 3)
    y <- List('a', 'b')
  } yield (x, y)

  println("For result:")
  forResult.foreach(println)

  // Sets
  val set = Set(1, 2, 3, 4, 5)
  val updatedSet = set + 6 // Adding an element to the set

  // Maps
  val map = Map("one" -> 1, "two" -> 2, "three" -> 3)
  val valueForKeyTwo = map("two") // Accessing value for key "two"

  println(s"Value for key 'two': $valueForKeyTwo")

}