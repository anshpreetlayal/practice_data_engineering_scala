// Trait for common behavior
trait Speaker {
  def speak(): Unit // Abstract method
}

// Base class
class Person(val name: String) {
  def greet(): Unit = println(s"Hello, my name is $name")
}

// Subclass inheriting from Person and mixing in Speaker trait
class Student(name: String) extends Person(name) with Speaker {
  override def speak(): Unit = println("I am a student")
}

// Subclass inheriting from Person and mixing in Speaker trait
class Teacher(name: String) extends Person(name) with Speaker {
  override def speak(): Unit = println("I am a teacher")
}

object TraitsInheritanceExample extends App {
  val student = new Student("Alice")
  val teacher = new Teacher("Bob")

  student.greet() // Output: Hello, my name is Alice
  student.speak() // Output: I am a student

  teacher.greet() // Output: Hello, my name is Bob
  teacher.speak() // Output: I am a teacher
}

