//Question 03 - WHOLESALE PRICE CALCULATOR

object Q3 extends App {

  // Function to Calculate the discount price
  def discountPrice(): Double = 24.95 * 60 / 100

  // Function to Calculate the total discount price for the amount of books
  def totalDiscountedPrice(noOfBooks: Double) = discountPrice * noOfBooks

  //Function to Calculate the shipping price
  def totalShippingPrice(noOfBooks: Double): Double = {
    var totalShippingPrice: Double = 0
    if (noOfBooks > 50) {
      val y: Double = noOfBooks - 50
      totalShippingPrice = (3 * 50) + (0.75 * y)
    }
    else {
      totalShippingPrice = 3 * noOfBooks
    }
    return totalShippingPrice
  }

  //Function to Calculate the whole sale price
  def calculateWholesaleCost(x: Double): Double = totalDiscountedPrice(x) + totalShippingPrice(x)

  //Function to display results
  def printResult(x: Double): Unit = { // Used to display results
    printf("********  Calculating the Wholesale Cost ********\n\n")
    printf(" The wholesale cost of %f books is: %f ", x, totalDiscountedPrice(x))
    printf("\n The total shipping price of %f books is: %f ", x, totalShippingPrice(x))
    printf("\n The total wholesale price of %f books is: %f \n", x, calculateWholesaleCost(x))
  }
  printResult(60)
}