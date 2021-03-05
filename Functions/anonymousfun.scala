package Functions

object anonymousfun extends App {


  //anonymus function(LAMBDA)
  val doubler=(x:Int)=> x*2

  //multiple parameter in a lambda
  val adder:(Int,Int)=>Int=(a:Int,b:Int)=>a+b

  //No parameter is used in lambda
  val justdosomething:() => Int = () => 3

  println(justdosomething)
  println(justdosomething())


  // Creating anonymous functions
  // with multiple parameters Assign
  // anonymous functions to variables
  var myfc1 = (str1:String, str2:String) => str1 + str2

  // An anonymous function is created
  // using _ wildcard instead of
  // variable name because str1 and
  // str2 variable appear only once
  var myfc2 = (_:String) + (_:String)

  // Here, the variable invoke like a function call
  println(myfc1("Geeks", "12Geeks"))
  println(myfc2("Geeks", "forGeeks"))


  //anonymous function with the parameters.

  // SYNTAX----var functionname = (parameter : Datatype) => implementation
  var abfun=(a:String,b:String)=>a + b
  println(abfun("Arsh","Meer"))

  var abcfunction=(a:Int,b:Int)=>a-b
  println(abcfunction(20,50))

  var wildcard=(_:String)+(_:String)
  println(wildcard("Sam","arsh"))


  var num=(d:Int,e:Int)=>d-e
  println(num(50,30))

//with parameter
  var adingnumber = (a :Int,b : Int) => a + b
  println(adingnumber(100,200))


  //wildcard

  var num2 = (_ :String) + " " +(_ :String)
  println(num2("Arsh Weds","Meer"))

  //without parameter

  // Creating anonymous functions
  // without parameter
  var myfun1 = () => {"Welcome to GeeksforGeeks...!!"}
  println(myfun1())

  // A function which contain anonymous
  // function as a parameter
  def myfunction(fun:(String, String)=> String) =
  {
    fun("Dog", "Cat")
  }

  // Explicit type declaration of anonymous
  // function in another function
  val f1 = myfunction((str1: String,
                       str2: String) => str1 + str2)

  // Shorthand declaration using wildcard
  val f2 = myfunction(_ + _)
  println(f1)
  println(f2)


  var add = () =>{"adding function"}
  println(add())



}
