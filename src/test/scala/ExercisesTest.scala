import org.scalatest.FunSuite

class ExercisesTest extends FunSuite {

  val exercise = new Exercises

  test("Fibonacci return correct value"){
    assert(exercise.fibonacci(10)==55)
    assert(exercise.fibonacci(15)==610)
    assert(exercise.fibonacci(30)==832040)
  }

}
