import org.scalatest._

class ABC085CTest extends FunSuite {
  test("1") {
    val line = "9 45000"
    val result = ABC085C.run(line)
    // assertResult(result)("4 0 5")
    assert(result == "4 0 5" || result == "0 9 0")
  }

  test("2") {
    val line = "20 196000"
    val result = ABC085C.run(line)
    assertResult(result)("-1 -1 -1")
  }

  test("3") {
    val line = "1000 1234000"
    val result = ABC085C.run(line)
    assert(result != "-1 -1 -1")
  }

  test("4") {
    val line = "2000 20000000"
    val result = ABC085C.run(line)
    assertResult(result)("2000 0 0")
  }
}
