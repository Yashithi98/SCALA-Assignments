//QUESTION 04
object Q4 extends App{

  def Result(): Unit= { //Function to display results
    printf(" ***** Answer for question four *****\n")
    var acc1 = new account("987380012v", 10001, 35000)
    var acc2 = new account("985678900v", 10002, 10000)
    var acc3 = new account("984356789v", 10003, 4500)
    var acc4 = new account("989876543v", 10004, -1000)
    var acc5 = new account("981234567v", 10005, 0)

    var bank: List[account] = List(acc1, acc2, acc3, acc4, acc5)
    println("\nBank Account Details : ")
    println(bank)

    val overdraft = (b: List[account]) => b.filter(x => x.balance < 0)
    println("\nOverdraft account Details : ")
    println(overdraft(bank))

    val balance = (a: List[account]) => a.reduce((x, y) => (new account(x.nic, x.accNumber, x.balance + y.balance)))
    println("\nSum of all account balances : ")
    println(balance(bank).balance)

    val interest = (acc: List[account]) => acc.map(x => {
      if (x.balance < 0) (new account(x.nic, x.accNumber, x.balance * 1.05)) else (new account(x.nic, x.accNumber, x.balance * 1.1))
    })
    println("\nAccount details after interest : ")
    println(interest(bank))

  }

  class account(id:String, n:Int, b:Double){
    val nic:String = id
    val accNumber:Int = n
    var balance:Double = b

    def withdraw(a:Double)= this.balance = this.balance - a

    def deposit(a:Double) = this.balance = this.balance + a

    def transfer(a:account, b:Double){
      a.balance += b
      this.balance -= b
    }

    override def toString = "NIC :  "+nic+" Account Number : "+accNumber+" Balance : "+balance+" \n"
}

Result()



}
