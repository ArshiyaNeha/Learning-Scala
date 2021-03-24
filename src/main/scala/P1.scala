object P1 extends App {

  def sum(x:Int,y:Int):Int = x + y
  println("Sum of the two numbers ==" + sum(20,30))

  def areaofdisk (x:Double):Double = x*x*math.Pi
  println("Area of the Disk is ==" + " " + areaofdisk(2))


  //match expression

  /* syntax  <expression> match {

  case <pattern match> => <expression>
  case1 <pattern match> => <expression>
  case2 <pattern match> => <expression>
  case3 <pattern match> => <expression>
    }
     */

  def example(a:Int,b:Int):Int = a>=b match {
    case true => a
    case false => b

  }
println(example(20,40))

  def passfail(marks:Int):String = marks >=80 match {
    case true => "Pass"
    case false => "fail"
  }
println(passfail(45))


  def iseven(x:Int):Boolean = x%2 match {
    case 0 => true
    case _ => false
  }
  println(iseven(20))

 def grades(mark:Int) = mark match {
   case x if x>= 75 => "A"
   case x if x>= 65 => "B"
   case x if x>= 50 =>"c"
   case _ => "F"
 }
  println(grades(20))
}









