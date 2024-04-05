// Define a case class for representing people
case class Person(name: String, age: Int, city: String)

// Sample data of people
val people = List(
  Person("Alice", 30, "New York"),
  Person("Bob", 25, "Los Angeles"),
  Person("Charlie", 20, "Chicago"),
  Person("David", 35, "New York")
)

// Querying and transforming collections using a for comprehension
val adultsInCities = for {
  person <- people
  if person.age >= 25
} yield (person.name, person.city)

// Translated version using map, filter, and foreach
val adultsInCitiesTranslated = people
  .filter(_.age >= 25)
  .map(person => (person.name, person.city))

// Nested comprehensions using a for comprehension
val cityGroups = for {
  city <- people.map(_.city).distinct
} yield {
  val residents = people.filter(_.city == city).map(_.name)
  (city, residents)
}

// Translated version using map, distinct, and flatMap
val cityGroupsTranslated = people
  .map(_.city)
  .distinct
  .map { city =>
    val residents = people.filter(_.city == city).map(_.name)
    (city, residents)
  }

// Working with Option using a for comprehension
val maybeAge: Option[Int] = Some(30)
val ageStatus = for {
  age <- maybeAge
} yield {
  if (age >= 25) "Adult" else "Child"
}

// Translated version using map and getOrElse
val ageStatusTranslated = maybeAge.map { age =>
  if (age >= 25) "Adult" else "Child"
}.getOrElse("Unknown")

// Handling Errors with Either using a for comprehension
def divide(a: Int, b: Int): Either[String, Int] =
  if (b != 0) Right(a / b) else Left("Division by zero")

val divisionResult = for {
  result <- divide(10, 2)
} yield s"Result: $result"

// Translated version using map and getOrElse
val divisionResultTranslated = divide(10, 2).map(result => s"Result: $result").getOrElse("Error")

// Performing actions using a for comprehension
val actions = for {
  _ <- Some(println("Start"))
  _ <- Some(println("Middle"))
  _ <- Some(println("End"))
} yield ()

// Translated version using flatMap and foreach
val actionsTranslated = println("Start").flatMap { _ =>
  println("Middle").flatMap { _ =>
    println("End")
  }
}
