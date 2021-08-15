import java.util.Scanner

object ABC086A {
  def run(line: String): String = {
    val multiply = line.split(" ").map(_.toInt).reduce(_ * _)
    if (multiply % 2 == 0) {
      "Even"
    } else {
      "Odd"
    }
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
