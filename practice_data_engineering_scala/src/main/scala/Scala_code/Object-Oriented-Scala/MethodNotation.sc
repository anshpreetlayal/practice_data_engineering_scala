object MethodNotation{

  class Person(val name: String){
    def greet(another: Person): String =
      s"$name says: Hi, ${another.name}, how are u?"

    infix def likes(movie: String): String =
      s"$name says: I adore the movie $movie!!!"
  }
  val alice = Person("Alice")
  val bob = Person("Bob")

  def main(args: Array[String]): Unit = {
     println(alice.greet(bob))
    println(alice greet bob) // infix notation


    println(alice.likes("interstellar"))
    println(alice likes "interstellar")
  }
}