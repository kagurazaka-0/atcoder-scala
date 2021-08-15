import java.util.Scanner

object ABC085C {
  def run(line: String): String = {
    val Array(count, requestYen) = line.split(" ").map(_.toInt)

    // NOTE: viewをすることで、遅延評価にする
    // https://tanishiking24.hatenablog.com/entry/scala-generator
    // https://r9.hateblo.jp/entry/2016/01/12/234144
    // val rangeToCount = (0 to count).view
    // val rangeToCount = (count to 0 by -1).view

    // NOTE: for内包表記は下からloopを開始する
    val seq = for {
      _10k <- (0 to count).view
      _5k <- (0 to count - _10k).view
      _1k = count - _10k - _5k
      sum = _10k * 10000 + _5k * 5000 + _1k * 1000
    } yield ((_10k, _5k, _1k), sum)

    val result = seq
      .find { case (_, yen) => yen == requestYen }
      .map(_._1)
      .getOrElse((-1, -1, -1))

    s"${result._1} ${result._2} ${result._3}"
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
