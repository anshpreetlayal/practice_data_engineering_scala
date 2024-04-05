// Encapsulation of State
var count = 0
val incrementAndGet: () => Int = () => {
  count += 1
  count
}

println(incrementAndGet()) // Output: 1
println(incrementAndGet()) // Output: 2

// Modification of State
val adder: Int => Int = {
  var sum = 0
  (x: Int) => {
    sum += x
    sum
  }
}

println(adder(1)) // Output: 1
println(adder(2)) // Output: 3
println(adder(3)) // Output: 6

// Statefulness and Functional Programming
class Counter {
  private var count = 0

  def increment(): Int = {
    count += 1
    count
  }

  def decrement(): Int = {
    count -= 1
    count
  }

  def getCount: Int = count
}

val counter = new Counter
println(counter.increment()) // Output: 1
println(counter.increment()) // Output: 2
println(counter.decrement()) // Output: 1
println(counter.getCount)    // Output: 1


// stateful predictor
val statefulPredicate: Int => Boolean = {
  var threshold = 10
  (x: Int) => {
    if (x >= threshold) {
      threshold = x
      true
    } else {
      false
    }
  }
}

println(statefulPredicate(5)) // Output: false
println(statefulPredicate(12)) // Output: true


//managing state in class
class CounterWithReset {
  private var count = 0

  def increment(): Int = {
    count += 1
    count
  }

  def decrement(): Int = {
    count -= 1
    count
  }

  def reset(): Unit = {
    count = 0
  }

  def getCount: Int = count
}

val counter = new CounterWithReset
println(counter.increment()) // Output: 1
println(counter.increment()) // Output: 2
println(counter.decrement()) // Output: 1
counter.reset()
println(counter.getCount) // Output: 0
