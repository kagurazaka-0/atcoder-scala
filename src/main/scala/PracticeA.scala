import java.util.Scanner

object PracticeA {
  def run(lines: Array[String]): String = {
    val intList = (lines(0).toInt) +: (lines(1).split(" ").map(_.toInt))
    val sum = intList.reduce(_ + _)
    val text = lines(2)
    s"$sum $text"
  }

  // ANCHOR - common start
  implicit def scannerToArray(sc: Scanner): Array[String] = {
    var list = Array[String]()
    do {
      list = list :+ sc.nextLine()
    } while (sc.hasNextLine())
    list
  }
  def main(args: Array[String]) = {
    println(run(new Scanner(System.in)))
  }
  // ANCHOR - common end
}
