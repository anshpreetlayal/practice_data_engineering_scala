class Person(val name: String, val age: Int)

// Companion object
object Person {
  // Factory method to create instances of Person
  def apply(name: String, age: Int): Person = new Person(name, age)

  // Static method
  def defaultPerson(): Person = new Person("John moore", 30)
}

object CompanionObjectsExample extends App {
  // Using the factory method from the companion object
  val person1 = Person("Alice", 25)
  val person2 = Person.apply("Bob", 35)

  // Using the static method from the companion object
  val defaultPerson = Person.defaultPerson()

  println(s"Person 1: ${person1.name}, ${person1.age}")
  println(s"Person 2: ${person2.name}, ${person2.age}")
  println(s"Default Person: ${defaultPerson.name}, ${defaultPerson.age}")
}