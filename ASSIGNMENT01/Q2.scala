//Question 02 - CALCULATING THE VOLUME OF A SPHERE

object Q2 extends App {

  //Function to calculate volume
  def calculateVolume(x: Double): Double = 4.0 / 3.0 * math.Pi * x * x * x

  //Function to display results
  def printResult(R:Double): Unit ={
    printf("********  Calculating the volume of a Sphere ********\n\n")
    printf(" Radius: %f \n Volume of the Sphere: %f \n",R, calculateVolume(R))
  }
  printResult(5)
}




