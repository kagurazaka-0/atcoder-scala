import org.scalatest._

class ABC085BTest extends FunSuite {
  test("1") {
    val lines = """|4
                   |10
                   |8
                   |8
                   |6""".stripMargin.split("\n")

    val result = ABC085B.run(lines)
    assertResult(result)("3")
  }

  test("2") {
    val lines = """|3
                   |15
                   |15
                   |15""".stripMargin.split("\n")

    val result = ABC085B.run(lines)
    assertResult(result)("1")
  }

  test("3") {
    val lines = """|7
                   |50
                   |30
                   |50
                   |100
                   |50
                   |80
                   |30""".stripMargin.split("\n")

    val result = ABC085B.run(lines)
    assertResult(result)("4")
  }
}
