object recursion extends App {

  def gcd(x:Int,y:Int):Int = y match {
    case 0 => x
    case y if (y>x) => gcd(y,x)
    case _ => gcd(y,x%y)
  }
println(gcd(2,4))


  //Arrays
  var marks = Array(2,5,8,3,5,7)
  var newmarks = Array(20,30,80,90,50)
  println("All the elements of array")
  for(x <- marks)
    {
      println(x)
    }
  //appending 1 item
  val addelement = marks :+ 10
  println("Array b ")
  for ( x <- addelement ) {
  {
    println( x )
  }
  }
  //appending N number of items
  val addNelements = marks ++ newmarks
  for(y <- addNelements){
    println(y)
  }

  //prepending
  val prependelements = 3 +:  addNelements
  val prependNnumber = Array(100,300) ++ prependelements
  println("prepending")
  for(z <- prependelements){
    println(z)
  }
  println("Prepending N Number of elements")
  for(s <- prependNnumber){
    println(s)
  }

//anonymous function or Lambda syntax
  //val fieldname = input patameter  => function body
  val add = (a : Int, b : Int) => a + b
  println(add(10,20))

  //An anonymous function is created using _ wildcard instead of variable name
  var myfc2 = (_:Int) + (_:Int)
  println(myfc2(2,4))


  //currying function
  val add2 = (x : Int) => (y : Int) => x + y
  println(add2(90)(10))


  //Filters
  //check odd even
  val f1 = (x : Int) => x%2 == 0
  //filter even number
  //val f2 = 11.filter(f1)

  //reduce
  val l = List(1,3,5,7,9)
  println(l.reduce((x,y) => x max y))
  println(l.reduce((x,y) => x min y))
}
