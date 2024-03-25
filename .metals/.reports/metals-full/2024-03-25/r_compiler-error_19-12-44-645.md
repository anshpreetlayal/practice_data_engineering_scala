file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/Implicit_parameters.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition counter is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/data_and_abstraction.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/function_and_state.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.0
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.0\scala3-library_3-3.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 3086
uri: file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/Implicit_parameters.scala
text:
```scala
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

// Ad-hoc Polymorphism
trait Show[A] {
  def show(value: A): String
}

object Show {
  def apply[A](implicit show: Show[A]): Show[A] = show

  implicit val intShow: Show[Int] = (value: Int) => value.toString
  implicit val stringShow: Show[String] = (value: String) => value
}

def printShow[A](value: A)(implicit ev: Show[A]): Unit = {
  println(ev.show(value))
}

printShow(42) // Output: 42
printShow("Hello, Scala!") // Output: Hello, Scala!

// Given Instances
trait @@Show[A] {
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

// Conditional Instances
trait Show[A] {
  def show(value: A): String
}

object Show {
  def apply[A](implicit show: Show[A]): Show[A] = show

  // Implicit conversion for lists of numeric types
  implicit def listNumericShow[A: Numeric]: Show[List[A]] = (list: List[A]) => {
    list.map(_.toString).mkString(", ")
  }

  // Implicit conversion for lists of strings
  implicit val listStringShow: Show[List[String]] = (list: List[String]) => {
    list.mkString(", ")
  }
}

val intList: List[Int] = List(1, 2, 3)
val stringList: List[String] = List("Scala", "is", "awesome")

println(Show[List[Int]].show(intList)) // Output: 1, 2, 3

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition counter is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/data_and_abstraction.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/function_and_state.scala
One of these files should be removed from the classpath.