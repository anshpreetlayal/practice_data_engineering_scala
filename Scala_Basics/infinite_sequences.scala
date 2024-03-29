//Lazy Evaluation with LazyList:
// Generate an infinite sequence of natural numbers starting from 1
val naturalNumbers: LazyList[Int] = LazyList.from(1)

// Take the first 10 elements from the infinite sequence
val firstTen: Seq[Int] = naturalNumbers.take(10)

println(firstTen) // Output: LazyList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

// LazyList allows for efficient memory usage as elements are evaluated lazily


// Recursive Function for Infinite Sequences:
// Generate the Fibonacci sequence indefinitely using recursion
def fibonacci(a: BigInt, b: BigInt): LazyList[BigInt] = a #:: fibonacci(b, a + b)

val fibonacciSequence: LazyList[BigInt] = fibonacci(0, 1)

// Take the first 15 elements from the Fibonacci sequence
val firstFifteen: Seq[BigInt] = fibonacciSequence.take(15)

println(firstFifteen) // Output: LazyList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377)



//Custom Lazy Evaluation:
//You can implement custom lazy evaluation techniques using Lazy or thunk concepts. Here's a simple example:

// Custom lazy evaluation using a thunk
def lazySequence(start: Int): LazyList[Int] = {
  lazy val rest: LazyList[Int] = lazySequence(start + 1)
  start #:: rest
}

val customSequence: LazyList[Int] = lazySequence(0)

// Take the first 5 elements from the custom lazy sequence
val firstFive: Seq[Int] = customSequence.take(5)

println(firstFive) // Output: LazyList(0, 1, 2, 3, 4)