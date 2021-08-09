import org.scalatest._

class ABC086ATest extends FunSuite {
  test("1") {
    val line = "3 4"

    val result = ABC086A.run(line)
    assertResult(result)("Even")
  }

  test("2") {
    val line = "1 21"

    val result = ABC086A.run(line)
    assertResult(result)("Odd")
  }
}
