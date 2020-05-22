//Question 01 - CONVERTING CELSIUS TO FAHRENHEIT

object Q1 extends App {

  //Function to convert Celsius into Fahrenheit
  def convertToF(x: Double) : Double =  x*1.8000+32.00

  //Function to display results
  def printResult(C:Double):Unit={
    printf("********  Converting Celsius into Fahrenheit ********\n\n")
    printf(" Celsius: %f \n Fahrenheit: %f \n",C,convertToF(C))
  }
  printResult(35)    //Given temperature to convert
}