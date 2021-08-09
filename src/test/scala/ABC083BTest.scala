import org.scalatest._

class ABC083BTest extends FunSuite {
  test("1") {
    val line = "20 2 5"
    val result = ABC083B.run(line)
    assertResult(result)("84")
  }

  test("2") {
    val line = "10 1 2"
    val result = ABC083B.run(line)
    assertResult(result)("13")
  }

  test("3") {
    val line = "100 4 16"
    val result = ABC083B.run(line)
    assertResult(result)("4554")
  }
}
