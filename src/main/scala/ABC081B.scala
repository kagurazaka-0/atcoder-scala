import java.util.Scanner

object ABC081B {
  def shifted(numbers: Iterable[Int], deps: Int = 0): Int = {
    if (numbers.exists(_ % 2 == 1)) {
      deps
    } else {
      shifted(numbers.map(_ / 2), deps + 1)
    }
  }

  def run(lines: Array[String]): String = {
    val numbers = lines(1).split(" ").map(_.toInt)
    val result = shifted(numbers)
    s"$result"
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
