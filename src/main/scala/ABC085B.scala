import java.util.Scanner

object ABC085B {
  def run(lines: Array[String]): String = {
    val set = lines.drop(1).map(_.toInt).toSet
    s"${set.size}"
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
