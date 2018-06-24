
//You can achieve inheritance by using extends keyword.

class A{  
    var salary1 = 10000  
}  
  
class B extends A{  
    var salary2 = 20000  
}  
  
class C extends B{  
    def show(){  
        println("salary1 = "+salary1)  
        println("salary2 = "+salary2)  
    }  
}  
  
object Inheritance{  
    def main(args:Array[String]){    
        var c = new C()  
        c.show()  
      
    }  
}


//when subclass has primary default constructor then you can invoke only super class default constructor.
//-------------------------argument--------------------------------------------------argument-----------
//super class constructor will be called automatically from th esubclass primary constructor.


class A11(a:Int){
println("i am in A "+a)
}
class B11(a:Int,b:Int) extends A11(a:Int){
    println("i ma in B "+a+"/t"+b)
}
class C11(a:Int,b:Int,c:Int) extends B11(a:Int,b:Int){
    println("i ma in c "+a+"/t"+b+"/t"+c)
}
object MinObj extends App{
        var t=new C11(1,2,3)
}


class A12{
    println("i am a")
    def this(a:Int){
        this()
        println("i am a(int)")
    }
}
class B12 extends A12{
    println("i am b")
    def this(b:Int){
        this()
        println("i am b(int)")
    }
}
class C12 extends B12{
    println("i am c")
    def this(c:Int){
        this()
        println("i am c(int)")
    }
}

object ConF extends App{
    var y=new C12
    println()
   var h=new C12(44)
}

class HelloWorld{
    override def toString = {
          "Hello"
    }
    override def clone() = {
         this
    }
}

object HelloMinOb{
    def main(args: Array[String]): Unit = {
        var r=new HelloWorld
        println(r)
        println(r.getClass)
        println(r==r.clone())
        var h=new HelloWorld
        println(h)
        println(h.getClass)
        println(h==h.clone())
    }
}