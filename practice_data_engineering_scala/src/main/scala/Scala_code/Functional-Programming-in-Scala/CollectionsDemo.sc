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
  val sSetContains3 = aSet.contains(3)
  val aSetContains3_v2 = aSet(3)

  // add or remove items from the set - return a new set
  val aBiggerSet = aSet + 99
  val aSmallerSet = aSet - 4

  // concatenation == union
  val anotherSet = Set(4,5,6,7,8,9)
  val muchBiggerSet = aSet.union(anotherSet)
  val muchBiggerSet_v2 = aSet ++ anotherSet
  val muchBiggerSet_v3 = aSet | anotherSet

  // difference
  val diffSet = aSet.diff(anotherSet)
  val diffSet_v2 = aSet -- anotherSet

  // intersection
  val intersection = aSet.intersect(anotherSet)
  val interaction_v2 = aSet & anotherSet


  val combinations = for {
    x <- Set(1,2,3,4,5,6)
    y <- Set(1,2,3,4,5,6)
  } yield x * y

  def main(args: Array[String]): Unit = {

  }
}