import org.scalatest._

class ABC081BTest extends FunSuite {
  test("1") {
    val lines = """|3
                   |8 12 40""".stripMargin.split("\n")

    val result = ABC081B.run(lines)
    assertResult(result)("2")
  }

  test("2") {
    val lines = """|3
                   |5 6 8 10""".stripMargin.split("\n")

    val result = ABC081B.run(lines)
    assertResult(result)("0")
  }

  test("3") {
    val lines = """|6
                   |382253568 723152896 37802240 379425024 404894720 471526144""".stripMargin
      .split("\n")

    val result = ABC081B.run(lines)
    assertResult(result)("8")
  }
}
