import scala.annotation.tailrec

class Exercises {

  /*
    EXERCISE 1 (optional): Write a function to get the n th Fibonacci number. The
    first two Fibonacci numbers are 0 and 1 , and the next number is always the sum of
    the previous two. Your definition should use a local tail-recursive function.
  */
  def fibonacci(n: Int): Int = {
    @tailrec
    def go(a: Int, b: Int, c: Int): Int = {
      if (n == 0 || n == 1) n
      else if (a == 0 || a == 1) go(a + 1, c, a)
      else if (a == n) b + c
      else go(a + 1, c, b + c)
    }
    go(0, 0, 0)
  }

}

