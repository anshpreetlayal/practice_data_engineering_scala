object AbstractDataTypes{



  // abstract classes
  abstract class  VideoGame{
    // fields or methods without implementation = abstract
    val gameType: String
    def play(): Unit


  // can provide normal field sor methods
  def runningPlatform: String = "FPS"
  }
  // cannot be instantiated
  // val videoGame: VideoGame = new VideoGame {
  // derived classes must be either A) abstact or B) with an impl for gametype

  class Shooter extends VideoGame{}
  override val gameType = "FPS"
  override def play(): Unit = println("fire!")

  def main(args: Array[String]): Unit = {
    val cs = new Shooter
    println(cs.runningPlatform)
  }
}