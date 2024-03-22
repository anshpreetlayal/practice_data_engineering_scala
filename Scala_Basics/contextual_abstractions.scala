// Define a trait for a generic logger
trait Logger {
  def log(message: String): Unit
}

// Define given instances for different logger implementations
object Logger {
  // Default logger implementation
  given defaultLogger: Logger {
    def log(message: String): Unit = println(s"[Default Logger] $message")
  }

  // Alternative logger implementation
  given alternativeLogger: Logger {
    def log(message: String): Unit = println(s"[Alternative Logger] $message")
  }
}

// Define a method that uses an implicit logger
def logMessage(message: String)(using logger: Logger): Unit = {
  logger.log(message)
}

// Usage
import Logger._

// Using the default logger
logMessage("This is a default logger message")

// Using the alternative logger
logMessage("This is an alternative logger message")(using alternativeLogger)
