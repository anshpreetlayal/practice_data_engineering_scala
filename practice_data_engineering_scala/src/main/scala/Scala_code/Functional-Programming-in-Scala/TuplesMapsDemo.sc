object TuplesMapsDemo{

  //tuples
  val aTuple: (Int, String) = (2, "rock the jvm")
  val firstField = aTuple._1
  val secondField = aTuple._2

  // tuples of 2 elements have some syntax sugar
  val aTuple_v2 = 2 -> "rock the jvm" // same as aTuple

  // maps: keys -> vallues, unique keys
  val aMap = Map()
  val phonebook = Map(
    "Jim" -> 555,
    "Daniel" -> 921,
    "Jane" -> 123
  )

  // core methods
  // keys exists in the map
  val hasDaniel = phonebook.contains("Daniel") // true
  val danielsNumber = phonebook("Daniel")

  // add a new pair - returns a new map
  val newPair = "mary" -> 678
  val newPhonebook = phonebook + newPair

  // remove a key
  val noDaniel = phonebook - "Daniel"

  // lists of tuples <-> maps
  val listOfEntries = List(
    "Jim" -> 555,
    "Daniel" -> 921,
    "Jane" -> 123
  )

  val phonebook_v2 = listOfEntries.toMap
  val listOfEntries_v2 = phonebook.toList

  // set of keys
  val allNames = phonebook.keySet
  val allNumbers = phonebook.values.toList

  def main(args: Array[String]): Unit = {

  }
}