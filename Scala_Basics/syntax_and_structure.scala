// Arithmetic and Boolean Expressions
val sum = 1 + 2 * 3  // Calculates the sum of 1 and 2 multiplied by 3
val isEven = (4 % 2 == 0) && (5 % 2 == 0)  // Checks if both 4 and 5 are even numbers

// Conditional Expressions (if-then-else)
val result = if (sum > 5) "greater than 5" else "less than or equal to 5"  // Determines if sum is greater than 5

// Functions with Recursion
def factorial(n: Int): Int = {  // Calculates the factorial of a number
  if (n <= 1) 1
  else n * factorial(n - 1)
}
val fact5 = factorial(5)  // Computes the factorial of 5

