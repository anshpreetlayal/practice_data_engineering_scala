object CaseClasses{

   case  class Pet(name: String, age: Int){
     // define fields and methods
   }

   // 1 - class constructor arguments auto promoted to fields
   val dino = new Pet("dino", 2)
   val dinoAge = dino.age

   // 2 - case classes can be built without the new keyword
   val dino_v2 = Pet("Dino", 2)

   // 3 - toString, equals, hashCode (Any type)
   class PetSimple(name: String, age: Int)
   val dinoSimple = new PetSimple("Dino", 2)

   // 4 - utility methods eg. copy
   val dinoYounger = dino.copy(age = 1) // new instance of pet with the same data

   // 5 - they have companion objects already created, with an apply method with the same signature as the constructor
   val dino_v3 = Pet.apply("Dino", 2)

   // 6 - they are serializable - for parallel/distribtued systems (eg. akka, pekko)

  def main(args: Array[String]): Unit = {
      println(dinoSimple.toString)
      println(dino.toString)
  }
}