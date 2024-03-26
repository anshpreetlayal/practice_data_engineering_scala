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
