//Singleton object is an object which is declared by using object keyword instead by class. No object is required to call methods declared inside singleton object.
//
//In scala, there is no static concept. So scala creates a singleton object to provide entry point for your program execution.
//If you don't create singleton object, your code will compile successfully but will not produce any output. Methods declared inside Singleton Object are accessible globally. A singleton object can extend classes and traits.
//In scala, there is no static concept. so in scala class we cant declare var or method as static
object SingletonObject {

  def test {
    println('d')
  }

}

object SinglonMain {

  def main(args: Array[String]) {
    SingletonObject.test

   // var a=new SingletonObject // we cant instantiate Singleton object
  }
}

//Scala Companion Object
//In scala, when you have a class with same name as singleton object, it is called companion class and the singleton object is called companion object.
//
//The companion class and its companion object both must be defined in the same source file.


class Companion{
    def hello{  
        println("Hello, this is Companion Class.")  
    }  
}  
object Companion{
    def main(args:Array[String]){  
        new Companion().hello
        println("And this is Companion Object.")  
    }  
}

//a companion object has accesss rights to the private member of companion class that other object do not.

