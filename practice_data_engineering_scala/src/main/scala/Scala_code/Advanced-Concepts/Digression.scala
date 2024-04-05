//Implicit Classes for Retroactive Extension:

// Existing type
case class Person(name: String, age: Int)

// Retroactively extending Person with new methods
implicit class PersonExtension(person: Person) {
  def greet(): String = s"Hello, my name is ${person.name}!"
}

val john = Person("John", 30)
println(john.greet()) // Output: Hello, my name is John!


//Implicit Conversions for Retroactive Extension:

// Existing type
case class Rectangle(width: Double, height: Double)

// Retroactively extending Rectangle with a new method
implicit def rectangleToArea(rectangle: Rectangle): Double = rectangle.width * rectangle.height

val rectangle = Rectangle(5.0, 10.0)
val area: Double = rectangle // Implicit conversion to calculate area

println(area) // Output: 50.0


//Retroactive Extension for String:

// Retroactively extending String with a new method
implicit class StringExtension(str: String) {
  def repeat(n: Int): String = str * n
}

val hello = "Hello, "
println(hello.repeat(3)) // Output: Hello, Hello, Hello,

//Retroactive Extension for List:

// Retroactively extending List with a new method
implicit class ListExtension[T](list: List[T]) {
  def secondOption: Option[T] = list.drop(1).headOption
}

val numbers = List(1, 2, 3, 4, 5)
println(numbers.secondOption) // Output: Some(2)