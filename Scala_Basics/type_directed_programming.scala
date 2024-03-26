// Define a type-safe domain for a banking application
case class Account(id: Int, balance: Double)

// Define a transaction type that operates on accounts
trait Transaction[A] {
  def execute(from: A, to: A, amount: Double): Unit
}

// Define a type-safe transfer transaction for accounts
given Transaction[Account] with {
  def execute(from: Account, to: Account, amount: Double): Unit = {
    if (from.balance >= amount) {
      from.copy(balance = from.balance - amount)
      to.copy(balance = to.balance + amount)
      println(s"Transfer successful: $amount transferred from Account ${from.id} to Account ${to.id}")
    } else {
      println("Insufficient balance for transfer")
    }
  }
}

// Define a function to perform a type-safe transfer using the given transaction
def performTransfer[A](from: A, to: A, amount: Double)(using transaction: Transaction[A]): Unit = {
  transaction.execute(from, to, amount)
}

// Usage example
val account1 = Account(101, 1000.0)
val account2 = Account(102, 500.0)

// Perform a type-safe transfer between accounts
performTransfer(account1, account2, 200.0)





// Define a sealed trait for shapes
sealed trait Shape

// Define case classes for different shapes
case class Circle(radius: Double) extends Shape
case class Rectangle(width: Double, height: Double) extends Shape
case class Square(side: Double) extends Shape

// Define a type class for calculating area
trait AreaCalculator[T] {
  def area(shape: T): Double
}

// Define implicit instances of the AreaCalculator type class for each shape
given AreaCalculator[Circle] with {
  def area(circle: Circle): Double = math.Pi * circle.radius * circle.radius
}

given AreaCalculator[Rectangle] with {
  def area(rectangle: Rectangle): Double = rectangle.width * rectangle.height
}

given AreaCalculator[Square] with {
  def area(square: Square): Double = square.side * square.side
}

// Define a function to calculate the area based on the shape's type
def calculateArea[T](shape: T)(using calculator: AreaCalculator[T]): Double = {
  calculator.area(shape)
}

// Example usage
val circle = Circle(5.0)
val rectangle = Rectangle(3.0, 4.0)
val square = Square(2.0)

println("Area of Circle: " + calculateArea(circle))
println("Area of Rectangle: " + calculateArea(rectangle))
println("Area of Square: " + calculateArea(square))
