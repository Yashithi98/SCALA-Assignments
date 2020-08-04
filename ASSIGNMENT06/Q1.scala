//QUESTION 01
object Q1 extends App{

  case class Point(a:Int, b:Int){

    def x: Int = a
    def y: Int = b

    def add(that:Point) = Point(this.x+that.x,this.y+that.y) //Adds two points
    def move(dx:Int,dy:Int) = Point(this.x+dx, this.y+dy)    //Move a point from the given distances
    def distance(that:Point) = scala.math.sqrt(scala.math.pow((this.x-that.x),2)+scala.math.pow((this.y-that.y),2)) //SQRT[(X1-X2)*2 + (Y1-Y2)]
    def invert()= Point(this.y,this.x)                      //Inverts a given point

  }

  def Result(): Unit= {//Function to demonstrate an example of the implemented functions

    printf("****** Example demonstrating the functions ****** \n\n")

    val p1 = Point(1,2)
    val p2 = Point(4,5)

    printf("Point 1 : ")
    println(p1)
    printf("Point 2 : ")
    println(p2)
    printf("After adding Point 1 to Point 2 : ")
    println(p1.add(p2))
    printf("After adding Point 1 by dx = 2 and dy = 3 : ")
    println(p1.move(2,3))
    printf("Distance between Point 1 and Point 2 : ")
    println(p1.distance(p2))
    printf("After inverting Point 1 : ")
    println(p1.invert())
  }
  Result()

}
