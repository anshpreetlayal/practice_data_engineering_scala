
object OOBasics {

  //classes and instances
  class Person(name: String, age: Int) { // class definition also cntains the definition of its contructor
  // inside, we can define val, var, def
  //fields (val or var)
  val allCaps = name.toUpperCase()
   //methods
   def greet(someone: String): String =
     s"$name says: HI $someone"


     // can define multiple methods with the same name(overloading), if we have a dofferent signature
     def greet(): String =
       s"Hi everyone, I'M $name"
  }
  val daniel = new Person("Daniel", 99) // daniel is an instance of Person (instantiation)





  def main(args: Array[String]): Unit = {
    println(daniel.allCaps)
    println(daniel.greet("alice"))
  }
}