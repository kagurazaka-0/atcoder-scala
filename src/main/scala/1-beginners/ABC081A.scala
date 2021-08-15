import java.util.Scanner

object ABC081A {
  def run(line: String): String = line.count(_ == '1').toString()

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
