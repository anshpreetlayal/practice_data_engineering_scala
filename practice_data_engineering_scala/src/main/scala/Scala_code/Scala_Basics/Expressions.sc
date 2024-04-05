object Expressions {

  //structures that evaluate to a value
  val meaningOfLife = 40 +2
  // math expressions
  val mathExpression = 2 + 3 * 7
  //Boolean expressions
  val equalityTest = 1 == 2
  // if expressions
  val IfExpression = if (equalityTest) 45 else 99
  val ifExpression_v2 = if equalityTest then 45 else 99


  // code blocks are also expressions
  val CodeBlock = {
    val value = 56

    value + 99
  }



  // pattern matching
  val someValue = 42
  val description = someValue match {
    case 1 => "the first"
    case 2 => "second"
    case 42 => "meaning of life"
    case _=> "something else"
  }
  def main(args: Array[String]): Unit = {

  }
}