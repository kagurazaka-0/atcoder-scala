import org.scalatest._

class ABC087BTest extends FunSuite {
  test("1") {
    val lines = """|2
                   |2
                   |2
                   |100""".stripMargin.split("\n")

    val result = ABC087B.run(lines)
    assertResult(result)("2")
  }

  test("2") {
    val lines = """|5
                   |1
                   |0
                   |150""".stripMargin.split("\n")

    val result = ABC087B.run(lines)
    assertResult(result)("0")
  }

  test("3") {
    val lines = """|30
                   |40
                   |50
                   |6000""".stripMargin.split("\n")

    val result = ABC087B.run(lines)
    assertResult(result)("213")
  }

}
