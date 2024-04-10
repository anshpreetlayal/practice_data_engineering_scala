object CollectionsDemo{
  //ranges
  val first10numbers = 1 to 10
   // repeat an action
   // convert to a collection
   val f10numbers = first10numbers.toList

  //arrays
  val anArray = Array.ofDim[Int](1000)
  //mutable
  anArray.update(31, 42) // sets the value at index 31 to the value 42
  val fifthNumber = anArray(4)

  //sets
  val aSet = Set(1,2,3,4,2,3,1,5)
  // test if an item is in the set or not

  def main(args: Array[String]): Unit = {

  }
}