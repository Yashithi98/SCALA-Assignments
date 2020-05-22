//QUESTION 02- CALCULATING THE BEST TICKET PRICE
import scala.util.control.Breaks._
object Q2 extends App {

  //Function to calculate the number of attendees for a particular ticket price given the relationship
  def calculateNoOfAttendees(ticketPrice:Double):Double={
    var noOfAttendees:Double= 0
    if(ticketPrice>15) noOfAttendees=120 - (ticketPrice-15)*4 //Decreases by 20/4
    else if (ticketPrice<15) noOfAttendees=120 + (15-ticketPrice)*4  //Increases by 20/4
    else noOfAttendees = 120
    return noOfAttendees
  }

  //Functions for calculations:
  def costForAttendees(ticketPrice:Double):Double= 3*calculateNoOfAttendees(ticketPrice)
  def totCostForAttendees(ticketPrice:Double):Double= 500+costForAttendees(ticketPrice)
  def totIncome(ticketPrice:Double):Double=  ticketPrice*calculateNoOfAttendees(ticketPrice)
  def profit(ticketPrice:Double):Double=  (totIncome(ticketPrice)-totCostForAttendees(ticketPrice))/totCostForAttendees(ticketPrice)
  def profitPercentage(ticketPrice:Double):Double=profit(ticketPrice)*100

  //Functions to determine the maximum out profit and the relevant maximum ticket price
  def maxProfit(profit1: Double,profit2:Double):Double=math.max(profit1,profit2)
  def maxProfitTicket(profit1: Double, profit2:Double, price1: Double,price2:Double):Double= if (math.max(profit1,profit2)== profit1) price1 else price2

  //Functions to calculate the profit over a range of ticket prices : starting from Ticket Price =0 and increase the ticket price until the number of attendees is <=0
  def calculateForRange(): Unit ={
    var ticketPrice:Double = 1
    var maximum:Double = 0.0
    var maximumTicketPrice:Double = 0
    breakable{ // To handle the break exception
      while( true ){
        if(calculateNoOfAttendees(ticketPrice)<=0){ // Once the no of attendees becomes zero the loop must break and print the maximum profit details
          printMax(maximum,maximumTicketPrice,calculateNoOfAttendees(maximumTicketPrice))
          break
        }
        printProfit(ticketPrice)
        maximum= maxProfit(profitPercentage(ticketPrice),maximum)
        maximumTicketPrice=maxProfitTicket(profitPercentage(ticketPrice),maximum,ticketPrice,maximumTicketPrice)
        ticketPrice=ticketPrice+1
      }
    }

  }

  //Functions to display the individual profits and the maximum profit
  def printProfit(ticketPrice:Double):Unit= printf("The profit if the Ticket Price is %d : %f %% \n",ticketPrice.toInt,profitPercentage(ticketPrice))
  def printMax(Max:Double,ticketPrice:Double,no:Double): Unit = printf("\n\nThe Maximum profit is : %f %% \n Ideal Ticket Price :%d \n No of Attendees :%d",Max,ticketPrice.toInt,no.toInt)

  //To display and run the program
  def printResult():Unit={
    printf("********  Determining The Best Ticket Price ********\n\n")
    calculateForRange()
    printf("\n******************************************************\n")
  }

  printResult()
}
