// Substitution Model Examples

// Example 1: Addition of Two Numbers
val result1 = 1 + 2
println(result1) // Output: 3

// Example 2: Nested Expressions
val result2 = (1 + 2) * 3
println(result2) // Output: 9

// Example 3: Function Application
def add(a: Int, b: Int): Int = a + b
val result3 = add(1, 2)
println(result3) // Output: 3

// Preconditions Using `require`

def divide(a: Int, b: Int): Int = {
  require(b != 0, "Denominator must be non-zero")
  a / b
}

// Usage
val result4 = divide(10, 2) // OK
val result5 = divide(10, 0) // IllegalArgumentException: Denominator must be non-zero

// Assertion

def factorial(n: Int): Int = {
  assert(n >= 0, "Factorial input must be non-negative")
  if (n == 0) 1 else n * factorial(n - 1)
}

// Usage
val result6 = factorial(5) // OK
val result7 = factorial(-1) // AssertionError: assertion failed: Factorial input must be non-negative

// Referential Transparency

def add(a: Int, b: Int): Int = a + b
val result8 = add(1, 2) // Referentially transparent

var total = 0
def addToTotal(x: Int): Int = {
  total += x
  total
} // Not referentially transparent due to mutable state

// Packages in Scala

package com.example

class MyClass {
  // Class definition
}

object Main {
  def main(args: Array[String]): Unit = {
    val myClass = new MyClass
    println(myClass)
  }
}

// Subtyping and Generics

trait Animal {
  def speak(): Unit
}

class Dog extends Animal {
  override def speak(): Unit = println("Woof!")
}

class Cat extends Animal {
  override def speak(): Unit = println("Meow!")
}

class AnimalList[A <: Animal](val animals: List[A]) {
  def makeAllSpeak(): Unit = {
    animals.foreach(_.speak())
  }
}

val animals = List(new Dog, new Cat)
val animalList = new AnimalList(animals)
animalList.makeAllSpeak()

// Bounds (Type Bounds) in Scala

class Container[T <: Comparable[T]](val value: T) {
  def compare(other: T): Boolean = value.compareTo(other) == 0
}

// Covariance
class CovariantContainer[+T](val value: T) {
  def getValue: T = value
}

// Contravariance
trait Comparator[-T] {
  def compare(a: T, b: T): Int
}

// Variance (Covariance) in Scala

class Container[+A](val elem: A) // Covariant container

def printAnimalName(container: Container[Animal]): Unit = println(container.elem.getClass.getSimpleName)

val dogContainer: Container[Dog] = new Container[Dog](new Dog())
printAnimalName(dogContainer) // Outputs "Dog"


