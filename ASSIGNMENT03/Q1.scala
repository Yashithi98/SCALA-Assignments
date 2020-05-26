//QUESTION 01 - Determining whether a number is prime

import scala.io.StdIn.readInt
object Q1 extends App{

    def gcdComputation(num1:Int,num2:Int): Int = num2 match{ //Function to find the GCD
        case 0 => num1
        case x if x > num1 => gcdComputation(x,num1)
        case x => gcdComputation(x,num1%x)
    }
    def prime(num1:Int,n:Int=2): Boolean = n match { //Function to find if a number is prime
        case x if(x==num1) => true
        case x if gcdComputation(num1,x)>1 => false
        case x => prime(num1,x+1)
    }
    def printResult(num1: Int): Unit={ //Function to display results
        if (prime(num1)) {
            printf("The number %d is a prime number",num1)
        }
        else{
            printf("The number %d is not a prime number",num1)
        }
    }
    def inputResult():Unit={ //Function to get the input and run the program
        printf(" ***** Determining if a number is prime or not *****\n\n")
        printf("Enter the number : ")
        val num1 = readInt()
        printResult(num1)
    }

    inputResult()
}
