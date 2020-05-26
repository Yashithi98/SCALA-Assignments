//QUESTION 02 - Displaying the Prime Sequence less than a given Number

import scala.io.StdIn.readInt
object Q2 extends App{

  def gcdComputation(num1:Int,num2:Int): Int = num2 match{ //Function to find the GCD
    case 0 => num1
    case x if x > num1 => gcdComputation(x,num1)
    case x => gcdComputation(x,num1%x)
  }
  def prime(num1:Int,n:Int): Boolean = n match { //Function to find if a number is prime
    case x if(x==num1) => true
    case x if gcdComputation(num1,x)>1 => false
    case x => prime(num1,x+1)
  }
  def primeSeq(num:Int) : Unit = { //Function to display the prime sequence
    if (prime(num,2)) printf("%d ",num)
    if (num > 2) primeSeq(num - 1)
  }

  def inputResult():Unit = { //Function to obtain the input and print
    printf(" ***** Displaying the Prime Sequence less than a given Number *****\n\n")
    printf("Enter the number : ")
    val num1 = readInt()
    printf("The prime sequence less than %d is : \n",num1)
    primeSeq(num1)
  }
  inputResult()
}

