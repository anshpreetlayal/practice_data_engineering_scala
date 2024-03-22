// Monoid type class
trait Monoid[A] {
  def empty: A
  def combine(x: A, y: A): A
}

// Monoid instance for integers
given Monoid[Int] with {
  def empty: Int = 0
  def combine(x: Int, y: Int): Int = x + y
}

// Monoid instance for strings
given Monoid[String] with {
  def empty: String = ""
  def combine(x: String, y: String): String = x + y
}

// Monoid instance for lists
given [A]: Monoid[List[A]] with {
  def empty: List[A] = Nil
  def combine(x: List[A], y: List[A]): List[A] = x ++ y
}

// Usage
def combineAll[A](list: List[A])(using m: Monoid[A]): A =
  list.foldLeft(m.empty)(m.combine)

val intList = List(1, 2, 3, 4, 5)
println(combineAll(intList)) // Output: 15
