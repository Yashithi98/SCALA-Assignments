//QUESTION 04 - Determining whether a number is odd or even

import scala.io.StdIn.readInt
object Q4 extends App{

  def isEven(n:Int): Boolean = n match{ //Function to determine if a number is odd or even
    case 0 => true
    case _ => isOdd(n-1)
  }
  def isOdd(n:Int): Boolean =(!isEven(n))

  def printResult(num:Int):Unit ={ // Function to display even or odd
    if(isEven(num)){
      printf("The digit %d is even",num)
    }
    else{
      printf("The digit %d is odd",num)
    }
  }
  def input():Unit ={ //Function to get the input and run the program
    printf(" ***** Determining whether a number is odd or even *****\n\n")
    printf("Enter Number : ")
    val num = readInt()
    printResult(num)
  }
  input()
}
