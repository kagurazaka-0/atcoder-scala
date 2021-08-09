import java.util.Scanner

// NOTE: arrayからtupleに変換する方法(不採用)
// https://stackoverflow.com/questions/12585549/how-to-convert-an-array-to-a-tuple

object ABC087B {
  def run(lines: Array[String]): String = {
    // val ns = lines.map(_.toInt)
    // val (yen500, yen100, yen50, amount) = (ns(0), ns(1), ns(2), ns(3))
    // NOTE: 左辺代入はパターンマッチが使える、そのためArrayの分割代入も可能
    val Array(yen500, yen100, yen50, amount) = lines.map(_.toInt)

    // NOTE: forは()ではなく、{}を使う方がベター
    // val sums =
    //   for (
    //     sum500 <- (0 to yen500).map(500.*);
    //     sum100 <- (0 to yen100).map(100.*);
    //     sum50 <- (0 to yen50).map(50.*)
    //   )
    //     yield sum50 + sum100 + sum500

    // 500円玉、100円玉、50円玉の数の合計をそれぞれ総当たりしたArray
    val sums = for {
      sum500 <- (0 to yen500).map(500.*)
      sum100 <- (0 to yen100).map(100.*)
      sum50 <- (0 to yen50).map(50.*)
    } yield sum50 + sum100 + sum500

    val resultCount = sums.count(_ == amount)
    s"$resultCount"
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
