package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}

class TemperatureConversionTest extends FreeSpec with Matchers {


  "A function to convert temperatures" - {

    /**
      * Convert Centigrade to Fahrenheit.
      * Hint: Multiply by 9, then divide by 5, then add 32
      */
    "Centigrade to Fahrenheit" - {
      "0°C is 32°F" in {
        TemperatureConverter.centigradeToFahrenheit(0) shouldBe 32
      }
      "25°C is 77°F" in {
        TemperatureConverter.centigradeToFahrenheit(25) shouldBe 77
      }
    }


    /**
      * Convert Fahrenheit to Centigrade.
      * Hint: Deduct 32, then multiply by 5, then divide by 9
      */
    "Fahrenheit to Centigrade" - {
      "212°F is 100°C" in {
        TemperatureConverter.fahrenheitToCentigrade(212) shouldBe 100
      }
      "50°F is 10°C" in {
        TemperatureConverter.fahrenheitToCentigrade(50) shouldBe 10
      }
    }
  }

}
