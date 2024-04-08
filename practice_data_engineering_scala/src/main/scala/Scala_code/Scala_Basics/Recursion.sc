object Recursion {

  def sum(n: Int): Int =
    if (n <= 0) 0
    else n + sum(n-1)


  // thinking in recursion
  def printN(string: String, n: Int): Unit=
    if (n <= 0) ()
    else {
      println(string)
      printN(string, n-1)
     }



// test all numbers from 2 to n /2, test whether n % d == 0
  def isPrime(n: Int): Boolean = {
    def testDivisors(d: Int): Boolean =
      if (d > n / 2) true
      else if (n % d == 0) false
      else testDivisors(d + 1)


      //last expression is the final thing
      if (n <= 0) false
      else if (n == 1) false
      else testDivisors(2)
  }

  /**
   * exercise
   * 1. Concatenate a string a set of number of times
   *  2. Fibonacci numbers
   */
   def concatenateN(string: String, n: Int): String =
     if (n <= 0) ""
     else string + concatenateN(string, n - 1)


   def fibonacci(n: Int): Int =
     if (n <= 1) 1
     else if (n == 2) 2
     else fibonacci(n - 1) + fibonacci(n - 2)






  def main(args: Array[String]): Unit = {
    println(sum(10))
    printN("Scala is awesome", 20)
    println(concatenateN("scala", 4))
    println(fibonacci(6))
  }
}