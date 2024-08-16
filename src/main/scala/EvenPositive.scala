//WRITE A SCALA FUNCTION TO CHECK THE GIVEN NUMBER IS BOTH EVEN AND POSITIVE.
//
//SAMPLE DATA:
//14
object EvenPositive extends App{

  def fun(a:Int)= {
    if (a > 0 && a % 2 == 0)
      println("The number is both Even and Positive")
    else if (a<0 && a%2 !=0)
      println("The number is both odd and negative")
    else if (a>0 && a%2 !=0)
      println("The number is  odd and  positive")
    else if (a<0 && a%2 ==0)
      println("The number is  even and  negative")

  }
  fun(14)
}
