//Scala provides throws keyword to declare exception. You can declare exception with method definition. 
//It provides information to the caller function that this method may throw this exception. 
//It helps to caller function to handle and enclose that code in try-catch block to avoid abnormal termination of program.
//In scala, you can either use throws keyword or throws annotation to declare exception.

class ExceptionExample4{  
    @throws(classOf[NumberFormatException])  
    def validate()={  
        "abc".toInt  
    }  
}  
  
object ExceptionExample4Object{  
    def main(args:Array[String]){  
        var e = new ExceptionExample4()  
        try{  
            e.validate()  
        }catch{  
            case ex : NumberFormatException => println("Exception handeled here")  
        }  
        println("Rest of the code executing...")  
    }  
}  