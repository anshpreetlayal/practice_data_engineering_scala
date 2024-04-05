sealed trait Tree[A] // Define a sealed trait for a binary tree
case class Node[A](value: A, left: Tree[A], right: Tree[A]) extends Tree[A] // Node with value and left and right subtrees
case class Leaf[A](value: A) extends Tree[A] // Leaf node with a single value
case object Empty extends Tree[Nothing] // Empty tree

// Define a function to calculate the sum of all values in a tree
def sumTree[A](tree: Tree[A])(implicit num: Numeric[A]): A = {
  tree match {
    case Empty => num.zero // Base case: Empty tree has sum zero
    case Leaf(value) => value // Base case: Leaf node has the value as sum
    case Node(value, left, right) =>
      // Inductive step: Sum of a node is the value plus sum of left and right subtrees
      val sumLeft = sumTree(left)
      val sumRight = sumTree(right)
      num.plus(value, num.plus(sumLeft, sumRight))
  }
}

// Example usage
val tree = Node(1, Node(2, Leaf(3), Leaf(4)), Leaf(5)) // Define a binary tree
println(sumTree(tree)) // Output: 15 (1 + 2 + 3 + 4 + 5)
