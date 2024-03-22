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