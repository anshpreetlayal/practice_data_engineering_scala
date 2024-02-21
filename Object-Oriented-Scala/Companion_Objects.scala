class Person(val name: String, val age: Int)

// Companion object
object Person {
  // Factory method to create instances of Person
  def apply(name: String, age: Int): Person = new Person(name, age)

  // Static method
  def defaultPerson(): Person = new Person("John Doe", 30)
}
