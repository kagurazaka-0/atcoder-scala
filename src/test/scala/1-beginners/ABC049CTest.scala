import org.scalatest._

class ABC049CTest extends FunSuite {
  test("1") {
    val line = "erasedream"
    val result = ABC049C.run(line)
    assertResult(result)("YES")
  }

  test("2") {
    val line = "dreameraser"
    val result = ABC049C.run(line)
    assertResult(result)("YES")
  }

  test("3") {
    val line = "dreamerer"
    val result = ABC049C.run(line)
    assertResult(result)("NO")
  }
}
