object Instructions{

  // Instructions are executed vs expressions are evalutaed
  // in scala an instruction is a structure(expression) returning unit

  val printing: Unit = println("This is an instruction")
  val theUnit: Unit = ()

  //instructions - code blocks returning unit
  val aCodeBlock = {
    val LocalValue = 34
    println("Instruction 1")
    println("Instructions 3")
  }

  // variables in scala
  var Variable = 10
  var reassignment: Unit = Variable += 1

  def main(args: Array[String]): Unit = {
   // loops
   var thenumber = 1
    while ( thenumber <= 10){
      println(thenumber)
      thenumber += 1
    }
  }
}