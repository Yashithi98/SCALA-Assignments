//QUESTION 01- CALCULATING THE TAKE HOME SALARY
import scala.io.StdIn.readInt
object Q1 extends App {

  //Function to get input and printResult function
  def getinput(): Unit ={
    printf("********  Calculating Take Home Salary ********\n\n")
    printf("Enter the number of working hours of an employee: ")
    var w_hours = readInt()
    printf("Enter the number of working hours of an employee: ")
    var OT_hours = readInt()
    printf("\n*************************************\n")
    printResults(calculateTakeHomeSalary(w_hours,OT_hours))
  }

  //Functions to calculate the wage,OT,Income,Tax and Take home Salary
  def calculateWage(w_hours:Int): Int =w_hours*150
  def calculateOT(OT_hours:Int):Int= OT_hours*75
  def calculateIncome(w_hours:Int,OT_hours:Int):Int=calculateWage(w_hours)+calculateOT(OT_hours)
  def calculateTax(income:Int):Double=income*0.1
  def calculateTakeHomeSalary(w_hours:Int,OT_hours:Int):Double= calculateIncome(w_hours,OT_hours)-calculateTax(calculateIncome(w_hours,OT_hours))

  //Function to print the final result
  def printResults(finalSalary:Double):Unit= {
    printf("The Final Take Home Salary of Employee is : %f",finalSalary )
  }
   getinput()

}
