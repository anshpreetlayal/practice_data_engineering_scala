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
