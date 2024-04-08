
object StringOperations {


  // string
  val aString = "Scala Rocks"
  // functions attched to them
  val length = aString.length
  val checkEmpty = aString.isEmpty
  val startswithScala  = aString.startsWith("scala")
  val combine = aString + "very much"
  val findIndex = aString.indexOf("Astronaut")


  // interpolation - inject values or expressions inside a string
  val name = "Alice"
  val age = 12
  val greeting = "Hi, my name is " + name + " and I am " + age + "years old"
  val greeting_v2 = s"Hi, my name is $name and I am $age years old."
  def main(args: Array[String]): Unit = {

  }
}