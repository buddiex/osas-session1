package consulting.ikenna.beginningscala

object CheckoutSystem {
  def getTotal(items: String): Int = {
    /**
      * Shopping cart
      * You are building a checkout system for a shop which only sells apples and oranges.
      * Apples cost ₦300 and oranges cost ₦150.
      * Build a checkout system which takes a list of items scanned at the till and
      * outputs the total cost. Your input should be a list of strings.
      */
    val itemPrice =  Map("Apple" -> 300, "Orange" -> 150, "" -> 0)
    items.split("\\s+").map(x=>itemPrice.getOrElse(x,throw new IllegalArgumentException("No item called "+x))).sum
  }
}
