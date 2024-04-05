// Define a case class for representing a person
case class Person(name: String, age: Int, city: String)

// Sample data
val people = List(
  Person("Alice", 25, "New York"),
  Person("Bob", 30, "Los Angeles"),
  Person("Charlie", 28, "Chicago"),
  Person("David", 35, "San Francisco"),
  Person("Emily", 22, "Boston")
)

// Querying and transforming collections
val adultsInCities = for {
  person <- people // Iterate over each person in the list
  if person.age >= 25 // Filter adults (age >= 25)
} yield (person.name, person.city) // Extract name and city

// Nested comprehensions
val cityGroups = for {
  city <- people.map(_.city).distinct // Get unique cities
} yield {
  val residents = for {
    person <- people if person.city == city // Filter people by city
  } yield person.name // Extract names
  (city, residents)
}

// Working with Option
val maybeAge: Option[Int] = Some(30)
val ageStatus = for {
  age <- maybeAge
  status = if (age >= 25) "Adult" else "Child"
} yield status

// Handling Errors with Either
def divide(a: Int, b: Int): Either[String, Int] =
  if (b != 0) Right(a / b) else Left("Division by zero")

val divisionResult = for {
  result <- divide(10, 2)
} yield s"Result: $result"

// Performing actions
val actions = for {
  _ <- println("Start") // Print a message
  _ <- println("Middle")
  _ <- println("End")
} yield ()

// Displaying results
println("Adults in Cities:")
adultsInCities.foreach(println)
println("\nCity Groups:")
cityGroups.foreach { case (city, residents) => println(s"$city: $residents") }
println("\nAge Status:")
println(ageStatus.getOrElse("Unknown"))
println("\nDivision Result:")
println(divisionResult.getOrElse("Error"))
