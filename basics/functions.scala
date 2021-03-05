package basics

object functions extends App {

  //syntax of function
  //def functionname(parameter:datatype):return type={implementation}
  def functionname(a:String, b:Int):String ={
    a + " " + b

  }
//printing the function outside it.
  println(functionname("hello", 8))

  def parameterlessfunction():Int = 10
  println(parameterlessfunction())

  //Recursive functin

  def repeatfunction(aString:String,b:Int):String={
    if(b ==1) aString
    else aString + repeatfunction(aString, b-1)
  }
  println(repeatfunction("Arsh",5))
//wen v need loop ,use recursion function in scala

  def greet(name:String, age:Int):String= "hi my name is" + " " +name + " "+ "and my age is"+ age
  println(greet("Kinza",25))

//factorial fun

  def factorial(n:Int):Int={
    if(n<=0)1
    else n*factorial(n-1)
  }
  println(factorial(8))

  def fibonacci(n:Int):Int={
    if (n<=2)1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(8))




  //Example
  //declaring the function
  def addingnumbers(a:Int , b:Int):Int= {
    var num: Int = 0
    num = a + b

    return num

  }

//calling the function
println(addingnumbers(10,8))


  //ex2
  def animal(c:Int, d:Int):Int={
    var num1=0
     num1= c + d
    return num1


  }
println(animal(20,30))

  //ex3
  def numerical(a:Int,b:Int):Int={
      var abc=0
    abc= a+b
    return abc
  }
  println(numerical(30,60))


  //ex4
  def afun(a:Int,b:String):String={
    a +" "+ b
  }
println(afun(10,"Arshi"))
}
