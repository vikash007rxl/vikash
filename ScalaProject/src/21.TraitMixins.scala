
//trait mixins means you can extend any number of traits with a class or abstract class. You can extend only traits or combination of traits and class or traits and abstract class

//It is necessary to maintain order of mixins otherwise compiler throws an error.


trait Print{  
    def print()  
}  
  
abstract class PrintA4{  
    def printA4()  
}  
  
class A7 extends PrintA4 with Print{  
    def print(){                 // Trait print  
        println("print sheet")  
    }  
    def printA4(){              // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object TraitMixinsObject{  
    def main(args:Array[String]){  
        var a = new A7()  
        a.print()  
        a.printA4()  
    }  
}  

//we extend trait during object creation. 

trait Print3{  
    def print()  
}  
  
abstract class PrintA5{  
    def printA4()  
}  
  
class A8 extends PrintA5 {  
    def print(){                             // Trait print  
        println("print sheet")  
    }  
    def printA4(){                              // Abstract class printA4  
        println("Print A4 Sheet")  
    }  
}  
  
object TraitMixinsObject1{  
    def main(args:Array[String]){  
        var a = new A8() with Print3             // You can also extend trait during object creation  called layered trait
        a.print()  
        a.printA4()  
    }  
}

trait Print32{
    val i=88
    def print(): Unit ={
        println("print 33")
    }
}
class MainPrint extends Print32{
    override val i=77
    override def print(): Unit = {
        super.print()   //can call super method
      //  print(super.i)  //but cannot call super class variable or constructer
        println(i)
        println("print MainPrint")

    }
}

object MainObg{
    def main(args: Array[String]): Unit = {
        var hh=new MainPrint
        hh.print()
    }
}