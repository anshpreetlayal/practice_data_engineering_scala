import scala.collection.mutable.ListBuffer

// Define the Subject trait that observers will subscribe to
trait Subject {
  private val observers: ListBuffer[Observer] = ListBuffer()

  // Method to subscribe an observer to the subject
  def addObserver(observer: Observer): Unit = {
    observers += observer
  }

  // Method to unsubscribe an observer from the subject
  def removeObserver(observer: Observer): Unit = {
    observers -= observer
  }

  // Method to notify all observers when the state changes
  def notifyObservers(): Unit = {
    observers.foreach(_.update())
  }
}



// Concrete subject class that extends the Subject trait
class ConcreteSubject extends Subject {
  private var state: Int = 0

  // Method to get the current state of the subject
  def getState: Int = state

  // Method to set the state of the subject and notify observers
  def setState(newState: Int): Unit = {
    state = newState
    notifyObservers()
  }
}

// Concrete observer class that extends the Observer trait
class ConcreteObserver(val subject: ConcreteSubject) extends Observer {
  // Method to update the observer's state when the subject changes
  override def update(): Unit = {
    println(s"Observer updated with new state: ${subject.getState}")
  }
}

// Usage example
val subject = new ConcreteSubject
val observer1 = new ConcreteObserver(subject)
val observer2 = new ConcreteObserver(subject)

subject.addObserver(observer1)
subject.addObserver(observer2)

subject.setState(42)
subject.setState(100)
