package basics

object abstractdatatype extends App {

  //there are some situation where we have to leave field and methods empty or blank and unimplemented thiisis called abstrarct

  abstract class Animal{
    //we dont assign an value to the right hand side we leava it as a empty
    val creaturetype: String

    //methods are also left unimplemeted
    def eat: Unit
  }

    class dog extends Animal{

      //overrdide word is not complusary to use
      //for values we can diest assign the value to print
      override val creaturetype:String="nom nom"
      //for methods we need println to print
      override def eat:Unit=println("crunch crunch")
    }

  //TRAITS

  //traits can be inherited along classes
  trait carnivore{
    //(parameter:Type):return type
    def eat(animal:Animal):Unit
  }
  class crocodile extends Animal with carnivore{
     val creaturetype: String = "croc"
    def eat:Unit=println("nomnomnom")
    def eat(animal: Animal):Unit=println(s"i am crocidle and i eat ${animal.creaturetype}")
  }
  val dog=new dog
  val croc= new crocodile
  croc.eat(dog)

  //traits vs abstract
  //1.traits do not have constructor parameter
  //2.can extends from single class and are allowed to have multiple traits

}
