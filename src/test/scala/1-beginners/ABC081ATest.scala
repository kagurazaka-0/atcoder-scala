import org.scalatest._

class ABC081ATest extends FunSuite {
  test("1") {
    val line = "101"
    val result = ABC081A.run(line)
    assertResult(result)("2")
  }

  test("2") {
    val line = "000"
    val result = ABC081A.run(line)
    assertResult(result)("0")
  }
}
