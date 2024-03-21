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

  def main(args: Array[String]): Unit = {
    // Example of parallel computing using Future API
    val task1 = Future {
      println("Task 1 starting")
      Thread.sleep(1000) // Simulate work
      println("Task 1 completed")
    }

    val task2 = Future {
      println("Task 2 starting")
      Thread.sleep(1000) // Simulate work
      println("Task 2 completed")
    }

    // Both tasks run concurrently due to time slicing
    Thread.sleep(200) // Give some time for tasks to start
    println("Main thread continuing while tasks are running")

    // Example of atomicity using AtomicInteger
    synchronizedIncrement()
    println(s"Shared counter value after atomic increment: ${sharedCounter.get()}")

    // Example of simulating a deadlock
    simulateDeadlock()
  }
}
