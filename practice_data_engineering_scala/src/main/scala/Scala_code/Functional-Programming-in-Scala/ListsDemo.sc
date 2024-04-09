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




  /// map - transforming a list by applying a function on every element
  val tenxList = aList.map(x => x * 10)
  val scalaList = aList.map(x => s"Scala $x")



  // filter - transformas a lsit by just leeping the oitems satisfying a boolean function
  val evenNumbers = aList.filter(x => x % 2 == 0)


  // higher-order functions = take other functions as arguments/ return function as results
  // flatmap = transforms a list by appling the function to every element + combining the mini-lists obtained
  val expandedList = aList.flatMap(x => List(x, x + 1))

  def main(args: Array[String]): Unit = {
    println(aList)
    println(biggerList)
    println(biggerList_v2)
    println(stringRep)
    println(stringRep_v2)
    println(total)

  }
}