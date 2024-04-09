object ListsDemo{

  //singly linked list
  val aList: List[Int] = List.apply(1,2,3)

  // first element (head), rest of the list (tail)
  val firstElement: Int = aList.head
  val rest = aList.tail
  // add (prepend) an element to a list
  val biggerList = 0 :: aList

  // add (append) an elelment at the end of the list
  val biggerList_v2 = aList :+ 4

  // utility methods
  val  scalax5 = List.fill(5)("Scala")

  // reverse a list
  val reversedList = aList.reverse

  // concatenate with another list
  val concatenation = aList ++ List(4,5,6)

  // format the collection
  val stringRep = aList.mkString("|")
  val stringRep_v2 = aList.mkString("[", ", ", "]")

  // combine all elements in a list
  val total = aList.reduce(_+_)


  def main(args: Array[String]): Unit = {
    println(aList)
    println(biggerList)
    println(biggerList_v2)
    println(stringRep)
    println(stringRep_v2)
    println(total)

  }
}