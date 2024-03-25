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

