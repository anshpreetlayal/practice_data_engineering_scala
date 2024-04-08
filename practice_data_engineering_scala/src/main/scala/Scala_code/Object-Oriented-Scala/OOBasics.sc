
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

  /**
   * Exerise: imagine we're doing an app for car registration
   * create a car and a driver class
   *
   * Driver: first name, last name, year of birth
   *  -method full name
   *
   *  Car: make, model, year of release, owner
   *  -method ownerAge
   *  -method isOwnedBy(driver: Driver) - boolean if the driver is the same as the owner
   *  -copy (newYearOfRelease) - returns a new Car instance with the same data except the new year of release
   */
   class Driver(firstname: String, lastname: String, val yearofBirth: Int) {
    def fullName(): String =
      s"The Drivers full name is $firstname $lastname "
  }

    class Car(make: String, model: String, yearofRelease: Int, owner: Driver) {
      def ownerAge(): Int =
        yearofRelease - owner.yearofBirth

      def isOwnedBy(driver: Driver): Boolean =
        driver == owner

      def copy(newyearofRelease: Int): Car =
        new Car(make, model, newyearofRelease, owner)
    }


  def main(args: Array[String]): Unit = {
    println(daniel.allCaps)
    println(daniel.greet("alice"))
    val driver = new Driver("Riya", "kohli", 1999)
    val car = new Car("ferrari", "f1", "2005", driver)

    println(driver.fullName())
    println(car.ownerAge)
  }
}