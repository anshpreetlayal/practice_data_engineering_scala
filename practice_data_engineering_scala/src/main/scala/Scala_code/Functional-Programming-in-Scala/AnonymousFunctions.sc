object AnonymousFunctions{


  //apply
  //FunctionN
  val doubler: Function1[Int, Int] = new Function[Int, Int]{
    override def apply(n: Int): Int = n * 2
  }

  //function types
  val doubler_v2: Int => Int = (n: Int) => n * 2 // lambda equivalent to the above

  // more complex function types
  val adder: (Int, Int) => Int = (a: Int, b: Int) => a + b // equivalent to new function

  // zero arg functions Function)[A]
  val justDoSomething: () => Int = () => 42

  //alt syntax with curly braces
  val stringToInt = { (string: String) =>
     // block of code
     val stringLength = string.length
     stringLength + 45

  }

  def main(args: Array[String]): Unit = {

  }
}