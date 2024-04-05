// Define a class Person with a primary constructor
class Person(val name: String, var age: Int) {
  // Method to greet
  def greet(): Unit = {
    println(s"Hello, my name is $name and I'm $age years old.")
  }

  // Auxiliary constructor
  def this(name: String) = this(name, 0)
}

// Define an object to hold utility methods
object MathUtils {
  def square(x: Int): Int = x * x
}

// Main method to test the classes and objects
object Main {
  def main(args: Array[String]): Unit = {
    val person1 = new Person("Alice", 30)
    person1.greet()

    val person2 = new Person("Bob")
    person2.greet()

    val squared = MathUtils.square(5)
    println(s"The square of 5 is $squared")
  }
}

