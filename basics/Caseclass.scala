package basics

object Caseclass extends App {

  case class person(name:String,age:Int)
  //1.class parameter are fields
  val jim=new person("jim",39)
  println(jim.name)

  //2.sensible tostring
  println(jim.toString)

  //3.equals and hashcode implemented out of the box..
  val jim2=new person("jim",39)
  println(jim == jim2)

  //4.case class has handy copy method. no need to write the "NEW" keyword.
  val jim3=jim.copy(age = 45)
  println(jim3)

  //5.Case class has a companion object
  val theperson=person
  val mary=person("mary",23)




}
