import org.scalatest._

class PracticeATest extends FunSuite {
  test("入力例1") {
    val lines = """|1
                   |2 3
                   |test""".stripMargin.split("\n")

    val result = PracticeA.run(lines)
    assertResult(result)("6 test")
  }

  test("入力例2") {
    val lines = """|72
                   |128 256
                   |myonmyon""".stripMargin.split("\n")

    val result = PracticeA.run(lines)
    assertResult(result)("456 myonmyon")
  }
}
