

class FinallyClass{  
    def divide(a:Int, b:Int) = {  
        try{  
            a/b  
            var arr = Array(1,2)  
            arr(10)  
        }catch{  
            case e: ArithmeticException => println(e)  
            case ex: Exception =>println(ex)  
            case th: Throwable=>println("found a unknown exception"+th)  
        }  
        finally{  
            println("Finaly block always executes")  
        }  
        println("Rest of the code is executing...")  
    }  
}  
  
  
object FinallyObject{  
    def main(args:Array[String]){  
        var e = new FinallyClass()  
        e.divide(100,10)  
   
    }  
}  