package consulting.ikenna.beginningscala

object TemperatureConverter {

  def centigradeToFahrenheit(n: Int): Double = {
    /**
      * Convert Centigrade to Fahrenheit.
      * Hint: Multiply by 9, then divide by 5, then add 32
      */
    ((n*9)/5)+32
  }

  def fahrenheitToCentigrade(n: Int): Double = {
    /**
      * Convert Fahrenheit to Centigrade.
      * Hint: Deduct 32, then multiply by 5, then divide by 9
      */
    ((n-32)*5)/9
  }

}
