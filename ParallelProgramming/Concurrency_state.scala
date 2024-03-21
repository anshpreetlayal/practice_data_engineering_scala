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

 
  }
}
