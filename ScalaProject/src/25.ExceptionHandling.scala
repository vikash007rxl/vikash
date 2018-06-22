import scala.util.control.Exception.Catch
import java.sql.SQLException


//Scala makes "checked vs unchecked" very simple. It doesn't have checked exceptions. All exceptions are unchecked in Scala, even SQLException and IOException.

class ExceptionHandling{  
    def divide(a:Int, b:Int) = {  
      try{
            a/b             // Exception occurred here
            var arr = Array(1,2)  
            arr(10)  
      }
      catch
      {
        case e: SQLException => println(e)  
        println ("r")
        case e1: ArithmeticException => println(e1 + " found") 
        println ("r21")
        throw new Exception("as")
        case w:Exception => println(w + " found here")
        println ("r2")
        
        
      }   
      println("Rest of the code is executing1...")  
    }  
    println("Rest of the code is executing...")  
      
}  
object ExceptionHandlingObj{  
    def main(args:Array[String]){  
        var e = new ExceptionHandling()  
        e.divide(100,0)  
   
    }  
}  