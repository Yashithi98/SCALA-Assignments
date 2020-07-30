//QUESTION 03
object Q3 extends App{

  def Result(): Unit= { //Function to display results
    printf(" ***** Answer for question three *****\n\n")
    var acc1 = new account("987380012v", 10001, 20000)
    var acc2 = new account("987465476v", 10002, 25000)
    println(acc1)
    println(acc2)

    acc1.withdraw(1000);
    println("After withdrawing 2000 : ")
    println(acc1)
    acc1.deposit(5000)
    println("\nAfter depositing 5000 : ")
    println(acc1)
    acc1.transfer(acc2, 4000)
    println("\nAfter transferring 4000: ")
    println(acc1)
    println(acc2)
  }


class account(id:String,n:Int,b:Double) {
  val nic: String = id
  val accNumber: Int = n
  var balance: Double = b

  def withdraw(a: Double) = this.balance = this.balance - a

  def deposit(a: Double) = this.balance = this.balance + a

  def transfer(a: account, b: Double) {
    a.balance += b
    this.balance -= b
  }

  override def toString = "NIC No: " + nic + " Account No : " + accNumber + " Balance : " + balance


}

Result()

}
