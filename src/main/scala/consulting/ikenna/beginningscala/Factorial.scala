package consulting.ikenna.beginningscala

object Factorial {
  def nonTailRecursiveFactorial(n: Int): Int =  {
    if (n == 0) 1 else n * nonTailRecursiveFactorial(n-1)
  }

  def tailRecursiveFactorial(n: Int): Int =  {
    def innerFactorial(acc: Int, n: Int): Int = {
      if (n == 0) acc else innerFactorial(n*acc, n-1)
    }
    innerFactorial(1, n)
  }
}
