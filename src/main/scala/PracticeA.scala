import java.util.Scanner
import scala.io.Source

object PracticeA extends App {
  def run(lines: Array[String]): String = {
    val intList = (lines(0).toInt) +: (lines(1).split(" ").map(_.toInt))
    val sum = intList.reduce(_ + _)
    val text = lines(2)
    s"$sum $text"
  }

  def main() = {
    print(run(Source.fromFile("/dev/stdin").getLines().toArray))
  }
}
