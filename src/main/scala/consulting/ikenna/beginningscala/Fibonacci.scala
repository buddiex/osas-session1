package consulting.ikenna.beginningscala

object Fibonacci {
  /**
    * Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci sequence:
    * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34
    * Every number after the first two is the sum of the two preceding ones. That is,
    *  Xn = Xn-1 + Xn-2 , with seed values X0 = 0, and X1 = 1.
    * The Fibonacci sequence is named after Italian mathematician Leonardo of Pisa, known as Fibonacci.
    * Fibonacci numbers occur unexpectedly in mathematics and biology.
    *
    * Write a recursive function to calculate fibonacci numbers
    */

  def fibonacciNumbers(n:Int):Int = {
    if (n == 0 | n == 1)  n  else fibonacciNumbers(n-1) + fibonacciNumbers(n-2)
  }

  def tailRecursivefibonacciNumbers(n:Int):Int = {
    def innerRecursive(n: Int, prev: Int, acc: Int): Int = {
      if (n == 0) acc else innerRecursive(n-1, acc, acc + prev)
    }
    return innerRecursive(n, 1, 0)
  }

}
