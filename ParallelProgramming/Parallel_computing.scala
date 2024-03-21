import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import java.util.concurrent.atomic.AtomicInteger

object ParallelComputingExample {
  // Define a shared counter using AtomicInteger for atomicity
  val sharedCounter = new AtomicInteger(0)

  // Define a synchronized method to increment the shared counter
  def synchronizedIncrement(): Unit = {
    synchronized {
      sharedCounter.incrementAndGet()
    }
  }

  // Define a method to simulate a deadlock scenario
  def simulateDeadlock(): Unit = {
    val lock1 = new Object
    val lock2 = new Object

    val thread1 = new Thread(() => {
      lock1.synchronized {
        Thread.sleep(100) // Simulate work
        lock2.synchronized {
          println("Thread 1 acquired both locks")
        }
      }
    })

    val thread2 = new Thread(() => {
      lock2.synchronized {
        Thread.sleep(100) // Simulate work
        lock1.synchronized {
          println("Thread 2 acquired both locks")
        }
      }
    })

    thread1.start()
    thread2.start()
    thread1.join()
    thread2.join()
  }

 
}
