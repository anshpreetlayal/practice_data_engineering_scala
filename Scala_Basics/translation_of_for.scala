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
