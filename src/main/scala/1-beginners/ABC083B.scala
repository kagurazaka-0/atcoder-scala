import java.util.Scanner

object ABC083B {
  def run(line: String): String = {
    val Array(n, a, b) = line.split(" ").map(_.toInt)
    val digitMap = (1 to n).groupBy[Int](_ / 10)
    def filterFn(n: Int): Boolean = a <= n && n <= b

    val filtered = digitMap.flatMap[Int] {
      case (0, numbersFor1Digit) => {
        numbersFor1Digit.filter(filterFn)
      }

      case (_, numbers) => {
        numbers
          .map { n => (n, n.toString.map(_.asDigit).sum) }
          .filter { case (_, n) => filterFn(n) }
          .map(_._1)
      }
    }
    s"${filtered.sum}"
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
