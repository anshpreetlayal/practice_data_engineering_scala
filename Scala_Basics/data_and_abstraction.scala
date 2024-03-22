// 12. Functions and Data
case class Person(name: String, age: Int)

val people = List(
  Person("Alice", 30),
  Person("Bob", 25),
  Person("Charlie", 35)
)

val names = people.map(_.name)
println(names) // Output: List(Alice, Bob, Charlie)

// 13. Data Abstraction
class Counter {
  private var value = 0
  def increment(): Unit = value += 1
  def getValue: Int = value
}

val counter = new Counter
counter.increment()
println(counter.getValue) // Output: 1

// 14. Self-reference (this, that)
class Person(name: String) {
  def introduce(): String = s"My name is $name"
  def meet(other: Person): String = s"${this.introduce()}, nice to meet you, ${other.name}"
}

val alice = new Person("Alice")
val bob = new Person("Bob")
println(alice.meet(bob)) // Output: My name is Alice, nice to meet you, Bob

// 15. Pure Booleans
val isTrue = true
val isFalse = false

// 16. Pure Data (Algebraic Data Types)
sealed trait Shape
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape

// 17. Enums (Domain Modeling)
sealed trait DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek
case object Sunday extends DayOfWeek

// 18. Sequences, Vectors, Ranges
val seq = Seq(1, 2, 3, 4, 5)
val vec = Vector(1, 2, 3, 4, 5)
val range = 1 to 5
