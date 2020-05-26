
import scala.io.StdIn.readInt

object Q6 extends App {
    def fibonacci(num:Int):Int=num match { //Function to get the fibonacci number
        case 0 => 0
        case x if x==1 => 1
        case _ => fibonacci(num-1)+fibonacci(num-2)
      }
  def fibonacciSequence(num:Int):Unit={ //Function to print the fibonacci series of a given number
    if (num>0) fibonacciSequence(num-1)
    printf("%d ",fibonacci(num))
  }
  def printResult(num:Int):Unit ={ //Function to print results
    printf("The fibonacci series of %d is :",num)
    fibonacciSequence(num)
  }
  def input():Unit ={ //Function to get the input and run the program
    printf(" ***** Fibonacci Series of a number *****\n\n")
    printf("Enter Number : ")
    val num = readInt()
    printResult(num)
  }
  input()
}
