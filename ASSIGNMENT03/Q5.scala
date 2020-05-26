
import scala.io.StdIn.readInt

object Q5 extends App {

  def isEven(n:Int): Boolean = n match{ //Function to determine if a number is odd or even
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int): Boolean =(!isEven(n))
  def addition(num:Int):Int = num match { //Function to get the addition of only positive numbers
    case 0 => 0
    case x if isEven(x)=> x+addition(x-1)
    case x if !isEven(x)=>addition(x-1)
  }
  def printResult(num:Int):Unit ={ //Function to display the result
   printf("The addition of the even numbers less than %d is : %d",num,addition(num))
  }
  def input():Unit ={ //Function to get the input and run the program
    printf(" ***** Addition of the sequence of even numbers *****\n\n")
    printf("Enter Number : ")
    val num = readInt()
    printResult(num)
  }
  input()
}
