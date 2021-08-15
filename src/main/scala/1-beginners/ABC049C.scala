import java.util.Scanner

object ABC049C {
  // val TARGETS: Array[String] = Array("dream", "dreamer", "erase", "eraser")
  def run(line: String): String = {
    val result = "^(dream|dreamer|erase|eraser)+$".r.matches(line)

    if (result) {
      "YES"
    } else {
      "NO"
    }
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
