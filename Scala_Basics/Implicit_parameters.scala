// Implicit Parameters
case class User(name: String)

def greet(user: User)(implicit greeting: String): Unit = {
  println(s"$greeting, ${user.name}!")
}

implicit val defaultGreeting: String = "Hello"

val user = User("Alice")
greet(user) // Output: Hello, Alice!

// Implicit Conversions
class Celsius(val temperature: Double)
class Fahrenheit(val temperature: Double)

implicit def celsiusToFahrenheit(celsius: Celsius): Fahrenheit = {
  new Fahrenheit(celsius.temperature * 9 / 5 + 32)
}

val celsius = new Celsius(0)
val fahrenheit: Fahrenheit = celsius // Implicit conversion from Celsius to Fahrenheit

println(fahrenheit.temperature) // Output: 32.0

// Conditional Implicit Definitions
trait Show[A] {
  def show(value: A): String
}

object Show {
  def apply[A](implicit show: Show[A]): Show[A] = show

  // Implicit conversion for numeric types
  implicit def numericShow[A: Numeric]: Show[A] = (value: A) => value.toString

  // Implicit conversion for strings
  implicit val stringShow: Show[String] = (value: String) => value

  // Implicit conversion for Option[A] if A has a Show instance
  implicit def optionShow[A: Show]: Show[Option[A]] = {
    case Some(a) => s"Option(${Show[A].show(a)})"
    case None    => "None"
  }
}

val opt: Option[Int] = Some(42)
println(Show[Option[Int]].show(opt)) // Output: Option(42)

// Recursive Implicit Definitions
sealed trait Tree[A]
case class Node[A](value: A, left: Tree[A], right: Tree[A]) extends Tree[A]
case class Leaf[A](value: A) extends Tree[A]

trait PrettyPrint[A] {
  def prettyPrint(value: A): String
}

object PrettyPrint {
  def apply[A](implicit pp: PrettyPrint[A]): PrettyPrint[A] = pp

  implicit def treePrettyPrint[A](implicit ppA: PrettyPrint[A]): PrettyPrint[Tree[A]] = new PrettyPrint[Tree[A]] {
    def prettyPrint(tree: Tree[A]): String = tree match {
      case Node(value, left, right) => s"Node(${ppA.prettyPrint(value)}, ${PrettyPrint[Tree[A]].prettyPrint(left)}, ${PrettyPrint[Tree[A]].prettyPrint(right)})"
      case Leaf(value) => s"Leaf(${ppA.prettyPrint(value)})"
    }
  }

  implicit val intPrettyPrint: PrettyPrint[Int] = (value: Int) => value.toString
}

val tree: Tree[Int] = Node(1, Leaf(2), Node(3, Leaf(4), Leaf(5)))
println(PrettyPrint[Tree[Int]].prettyPrint(tree))

// Implicit Function Types
implicit val adder: Int => Int = x => x + 1

def increment(implicit adder: Int => Int): Int = adder(0)

val result = increment // No need to explicitly pass the implicit adder function
println(result) // Output: 1

