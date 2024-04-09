object Exceptions{


  def sumN(n: Int): Int =
    if (n < 0 ) throw new IllegalArgumentException("negative numbers unsupported!")
    else if (n >= 50000) throw new RuntimeException("Too big of a number - overflowing Int!")
    else if (n == 0) 0
    else n + sumN(n - 1)


    //try-catch
    val attempt = try{
      // block of code that can crash
      println((sumN(100000))
    } catch {
      case e: IllegalArgumentException => -1
    }

  def main(args: Array[String]): Unit = {

  }
}