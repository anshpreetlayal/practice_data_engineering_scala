object ListOperations {
  def main(args: Array[String]): Unit = {
    // Immutable Linked Lists
    val list = List(1, 2, 3, 4, 5)
    println(list) // Output: List(1, 2, 3, 4, 5)

    val newList = 0 :: list
    println(newList) // Output: List(0, 1, 2, 3, 4, 5)

    // Higher-Order List Functions
    val numbers = List(1, 2, 3, 4, 5)
    val doubled = numbers.map(_ * 2)
    println(doubled) // Output: List(2, 4, 6, 8, 10)

    val evens = numbers.filter(_ % 2 == 0)
    println(evens) // Output: List(2, 4)

    // Reduction of Lists
    val sum = numbers.reduceLeft(_ + _)
    println(sum) // Output: 15

    // Primary Constructor and Auxiliary Constructors
    class Person(name: String, age: Int) {
      println(s"Creating a person named $name aged $age")
    }

    val person1 = new Person("Alice", 30)
    val person2 = new Person("Bob")
    val person3 = new Person()
  }
}
