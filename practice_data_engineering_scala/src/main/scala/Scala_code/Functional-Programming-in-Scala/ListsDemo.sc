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


  /**
   * Exercises
   * 1. Take a list of numbers, return a list of "scala " repeated that many times
   * 2. Generate the first n numbers in a list with a recursive function
   * 3. from that list, return just the prime numbers
   * take a list of numbers, return a list of all the digits of those numbers
   *
   */


  def concatenateN(string: String, n: Int): String =
    if (n <= 0) ""
    else string + concatenateN(string, n - 1)

  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)

    if (n <= 0) false // dont support negative numbers
    else if (n == 1) false // 1 is not a prime
    else testDivisors(2)
  }
  def repeatScala(numbers: List[Int]): List[String] =
    numbers.map(n => concatenateN("Scala", n))

  def generateN(n: Int): List[Int]=
    if (n <= 0) List()
    else generateN(n - 1) :+ n

  def primeOutOfFirstNNumbers(n: Int): List[Int] =
    generateN(n).filter(x => isPrime(x))




  // example
  val numbers = List(1,2,3,4)
  val colors = List("Black", "whitee", "blue")

  val combinations = numbers.flatMap(n => colors.map(c => s"$n-$c"))
   // for comprehensions
   val combinations_v2 = for {
     n <- numbers
     c <- colors
   } yield s"$n-$c" // same as the above implementation


  def main(args: Array[String]): Unit = {
    println(aList)
    println(biggerList)
    println(biggerList_v2)
    println(stringRep)
    println(stringRep_v2)
    println(total)
    println(tenxList)
    println(scalaList)
    println(expandedList)

    println(repeatScala(List(1,2,5)))
    println(generateN(100))

  }
}