//QUESTION 03 - Addition of the sequence of a number

import scala.io.StdIn.readInt
object Q3 extends App{
   def addition(num:Int):Int = num match { //Function to get the addition of sequence
     case 0 => 0
     case _ => num+addition(num-1)
   }
   def printResult(num :Int): Unit ={ //Function to print the result
     printf("The sum of the %d is %d",num,addition(num))
   }
   def input():Unit={ //Function to get the input and run the program
     printf(" ***** Addition of the sequence of a number *****\n\n")
     printf("Enter Number : ")
     val num = readInt()
     printResult(num)
  }
  input()
}
