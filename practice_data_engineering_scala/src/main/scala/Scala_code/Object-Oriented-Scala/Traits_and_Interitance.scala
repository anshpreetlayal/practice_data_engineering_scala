
object Inheritance {


   class VideoGame{
     val gameType = "interactive"
     def play(): Unit = println("game running!")
   }

   // single class inheritance
   class Shooter extends VideoGame {
     //can define own fields/ methods
     def multiplayer(): Unit + {
     play()
     println("boom, boom")
     }
   }

   val crysis = new shooter

   //inherit constructor
   class Person(val name: String, age: Int)
   class Adult extends Person("hogn doe", 0)

   val daniel = new  Adult
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

  def main(args: Array[String]): Unit = {
   println(crysis.gameType)
    crysis.multiplayer()

  }
}
