object FunctionalProgrammingExample {
  // Stateful function using a mutable variable
  var count = 0

  def increment(): Int = {
    count += 1
    count
  }

  // Function demonstrating referential transparency
  def add(x: Int, y: Int): Int = x + y

  // Observer Pattern implementation
  trait Observer {
    def onUpdate(): Unit
  }

  class Subject {
    private var observers: List[Observer] = List()

    def addObserver(observer: Observer): Unit = {
      observers = observer :: observers
    }

    def notifyObservers(): Unit = {
      observers.foreach(_.onUpdate())
    }
  }

  def main(args: Array[String]): Unit = {
    // Stateful function example
    println("Stateful function:")
    println(increment()) // Output: 1
    println(increment()) // Output: 2

    // Referential transparency example
    println("\nReferential transparency:")
    val result = add(1, 2) // result = 3
    val replacedResult = 3
    println(s"Original result: $result, Replaced result: $replacedResult")

    // Observer Pattern example
    println("\nObserver Pattern:")
    val subject = new Subject
    val observer = new Observer {
      override def onUpdate(): Unit = println("Update!")
    }

    subject.addObserver(observer)
    subject.notifyObservers() // Output: "Update!"
  }
}
