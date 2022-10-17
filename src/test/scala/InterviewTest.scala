// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class InterviewTest extends munit.FunSuite {
  test("interview solution") {
    assertEquals(solution(List(1, 2, 3)), Some(1))
  }
}
