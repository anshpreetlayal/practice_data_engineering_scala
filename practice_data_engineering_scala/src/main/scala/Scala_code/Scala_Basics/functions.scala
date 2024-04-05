
object Functions {

 def function (a: String, b: Int): String =
   a + " " + b

 // invoke a function
 val Invocation = function("scala", 99)

 // functions returning unit
 def VoidFunction(aString: String): Unit =
   println(aString)

  //can do alot of inside the inplementation of a function
 def functionwithSideEffects(aString: String): String = {
   println(aString) // side effects
   aString + " " + aString // last expressions gets returned
 }

  // can define smaller functions inside bigger ones
 def aBigFunction(n: Int): Int{
 //can define smaller functions
     def aSmallerFunction(a: Int, b: Int): Int = a + B

   aSmallerFunction(n, n +1 )
 }


  // Functions with Recursion
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  println(factorial(5)) // Output: 120

  // Higher-Order Functions
  def applyFunction(f: Int => Int, x: Int): Int = f(x)

  val square = (x: Int) => x * x
  println(applyFunction(square, 5)) // Output: 25

  // Anonymous Functions
  val addOne = (x: Int) => x + 1
  println(addOne(5)) // Output: 6

  // Currying
  def add(x: Int)(y: Int): Int = x + y

  val addTwo = add(2) _ // Partial application
  println(addTwo(3)) // Output: 5

  // Tail Recursion & Tail Calls
  def factorial(n: Int, acc: Int = 1): Int =
    if (n <= 1) acc
    else factorial(n - 1, acc * n)

  println(factorial(5)) // Output: 120

  // Finding Fixed Points
  def fixedPoint(f: Double => Double)(firstGuess: Double): Double = {
    val tolerance = 0.0001

    def isCloseEnough(x: Double, y: Double) =
      Math.abs((x - y) / x) / x < tolerance

    def iterate(guess: Double): Double = {
      val next = f(guess)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }

    iterate(firstGuess)
  }

  val sqrt = (x: Double) => fixedPoint(y => (y + x / y) / 2)(1.0)
  println(sqrt(2)) // Output: 1.4142135623746899
}