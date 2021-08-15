import java.util.Scanner

object ABC085C {
  def run(line: String): String = {
    val Array(count, requestYen) = line.split(" ").map(_.toInt)

    // NOTE: viewをすることで、遅延評価にする
    // https://tanishiking24.hatenablog.com/entry/scala-generator
    // https://r9.hateblo.jp/entry/2016/01/12/234144
    val rangeToCount = (0 to count).view
    // val rangeToCount = (count to 0 by -1).view

    // NOTE: for内包表記は下からloopを開始する
    val seq = for {
      z <- rangeToCount
      y <- rangeToCount
      x <- rangeToCount
      if (x + y + z == count)

      (a, b, c) = (x * 10000, y * 5000, z * 1000)
      // if (a <= requestYen && b <= requestYen && c <= requestYen)
    } yield ((x, y, z), a + b + c)
    // sum = x * 10000 + y * 5000 + z * 1000
    // if (sum <= requestYen)
    // } yield ((x, y, z), sum)

    val result = seq
      .find { case (_, yen) => yen == requestYen }
      .map(_._1)
      .getOrElse((-1, -1, -1))

    // val result = seq.to()

    s"${result._1} ${result._2} ${result._3}"
  }

  def main(args: Array[String]) = {
    val scanner = new Scanner(System.in)
    println(run(scanner.nextLine()))
  }
}
