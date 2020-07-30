//QUESTION 01

object Q1 extends App {

  def Result(): Unit={ //Function to display results
    printf(" ***** Answer for question one *****\n\n")
    val r1 = new rationalNum(3, 4)
    val r2 = new rationalNum(6, 7)
    var neg1 = r1.neg
    var neg2 = r2.neg
    println(neg1)
    println(neg2)

  }

  class rationalNum(n: Int, d: Int) {

    def numer: Int = n / (gcd(n, d))

    def denom: Int = d / gcd(n, d)

    def this(n: Int) = this(n, 1)

    private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

    def neg = new rationalNum(-this.numer, this.denom)

    override def toString = numer + "/" + denom

  }

  Result();
}