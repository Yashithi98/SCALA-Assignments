//QUESTION 02
object Q2 extends App{

  def Result(): Unit={ //Function to display results
    printf(" ***** Answer for question two *****\n\n")
    val x = new rationalNum(3,4)
    val y = new rationalNum(5,8)
    val z = new rationalNum(2,7)
    var a = x - y - z;
    println(a);

  }



  class rationalNum(n:Int,d:Int){

    def numer:Int = n/(gcd(n,d))
    def denom:Int = d/gcd(n,d)

    def this(n:Int) = this(n,1)

    private def gcd(a:Int,b:Int):Int= if(b==0) a else gcd(b,a%b)

    def neg = new rationalNum(-this.numer,this.denom)

    def -(r:rationalNum)= new rationalNum(this.numer*r.denom - this.denom*r.numer,this.denom*r.denom)

    override def toString = numer + "/" + denom
  }
  Result()
}
