// Classes and Objects

// Class Person with primary constructor
class Person(val name: String, var age: Int) {
  def greet(): Unit = {
    println(s"Hello, my name is $name and I'm $age years old.")
  }
  
  // Auxiliary constructor
  def this(name: String) = this(name, 0)
}

// Object MathUtils
object MathUtils {
  def square(x: Int): Int = x * x
}

// Traits and Inheritance

// Trait Speaker
trait Speaker {
  def speak(): Unit
}

// Class Animal
class Animal(val name: String) {
  def makeSound(): Unit = println("Some sound")
}

// Class Dog inheriting from Animal and mixing in Speaker trait
class Dog(name: String) extends Animal(name) with Speaker {
  override def speak(): Unit = println("Woof!")
}

// Companion Objects

// Companion object Person
object Person {
  def apply(name: String, age: Int): Person = new Person(name, age)
}

// Polymorphism in Scala

// Subtyping Polymorphism
val animal: Animal = new Dog("Buddy")
animal.makeSound() // Outputs "Woof!"

// Parametric Polymorphism
def identity[A](a: A): A = a

val result: Int = identity  // result = 5

// Type Bounds and Variance
class Container[+A](val elem: A) // Covariant container

def printAnimalName(container: Container[Animal]): Unit = println(container.elem.getClass.getSimpleName)

val dogContainer: Container[Dog] = new Container[Dog](new Dog("Rex"))
printAnimalName(dogContainer) // Outputs "Dog"
