file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/monads_and_monoids.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition fibonacci is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/infifnite_sequences.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/infinite_sequences.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.0
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.0\scala3-library_3-3.3.0.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 1363
uri: file:///C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/monads_and_monoids.scala
text:
```scala
sealed trait Maybe[+A]
case class Just[A](value: A) extends Maybe[A]
case object Nothing extends Maybe[Nothing]

implicit class MaybeOps[A](value: Maybe[A]) {
  def flatMap[B](f: A => Maybe[B]): Maybe[B] = value match {
    case Just(v) => f(v)
    case Nothing => Nothing
  }

  def map[B](f: A => B): Maybe[B] = value match {
    case Just(v) => Just(f(v))
    case Nothing => Nothing
  }
}

object MonadExample {
  def main(args: Array[String]): Unit = {
    val maybeValue: Maybe[Int] = Just(42)
    val result = maybeValue.flatMap(v => if (v > 0) Just(v * 2) else Nothing)
    println(result) // Output: Just(84)

    val emptyValue: Maybe[Int] = Nothing
    val emptyResult = emptyValue.flatMap(v => Just(v * 2))
    println(emptyResult) // Output: Nothing

    val mappedResult = maybeValue.map(_ * 3)
    println(mappedResult) // Output: Just(126)
  }
}



// Define the Monoid type class
trait Monoid[A] {
  def empty: A
  def combine(x: A, y: A): A
}

// Define Monoid instances for Integers and Strings
given Monoid[Int] with {
  def empty: Int = 0
  def combine(x: Int, y: Int): Int = x + y
}

given Monoid[String] with {
  def empty: String = ""
  def combine(x: String, y: String): String = x + y
}

// Define a function to combine elements of a list using Monoid
def combineAll[A](list: List[A])(u@@sing m: Monoid[A]): A =
  list.foldLeft(m.empty)(m.combine)

// Usage examples
val intList = List(1, 2, 3, 4, 5)
val combinedInt = combineAll(intList)
println(s"Combined Integers: $combinedInt") // Output: Combined Integers: 15

val stringList = List("Hello, ", "Scala, ", "World!")
val combinedString = combineAll(stringList)
println(s"Combined Strings: $combinedString") // Output: Combined Strings: Hello, Scala, World!

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition fibonacci is defined in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/infifnite_sequences.scala
and also in
  C:/Users/anshp/IdeaProjects/practice_data_engineering_scala/Scala_Basics/infinite_sequences.scala
One of these files should be removed from the classpath.