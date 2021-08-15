import java.util.Scanner

object PracticeA {
  def run(lines: Array[String]): String = {
    val intList = (lines(0).toInt) +: (lines(1).split(" ").map(_.toInt))
    val sum = intList.reduce(_ + _)
    val text = lines(2)
    s"$sum $text"
  }

  implicit def scannerToIterator(scanner: Scanner) = new Iterator[String] {
    def hasNext: Boolean = scanner.hasNextLine()
    def next(): String = scanner.nextLine()
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.toArray))
  }
}
