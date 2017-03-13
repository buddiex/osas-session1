package consulting.ikenna.beginningscala

import org.scalatest.{FreeSpec, Matchers}


class CheckoutSystemTest extends FreeSpec with Matchers {

  /**
    * Shopping cart
    * You are building a checkout system for a shop which only sells apples and oranges.
    * Apples cost ₦300 and oranges cost ₦150.
    * Build a checkout system which takes a list of items scanned at the till and
    * outputs the total cost. Your input should be a list of strings.
    */

  "Checkout System" - {
    "should have a total of zero when input is empty" in {
      CheckoutSystem.getTotal("") should be(0)
    }

    "should give a total of 300 Naira for 1 apple" in {
      CheckoutSystem.getTotal("Apple") should be(300)
    }

    "should give a total of 150 Naira for 1 orange" in {
      CheckoutSystem.getTotal("Orange") should be(150)
    }

    "should give a total of 900 Naira for 3 apples" in {
      CheckoutSystem.getTotal("Apple Apple Apple") should be(900)
    }

    "should give a total of 1050 Naira for input 'Apple, Apple, Orange, Apple' " in {
      CheckoutSystem.getTotal("Apple Apple Orange Apple ") should be(1050)
    }

    "should throw exception if invalid input is entered" in {
      intercept[IllegalArgumentException] {
        CheckoutSystem.getTotal("gobbledygook")
      }
    }

  }

}