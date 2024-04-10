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

  def main(args: Array[String]): Unit = {

  }
}