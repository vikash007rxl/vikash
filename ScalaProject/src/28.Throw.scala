


  class ExceptionExample12{
    def validate(age:Int)={  
        if(age<18)  
            throw new ArithmeticException("You are not eligible")  
        else println("You are eligible")  
    }  
}  
  
object ThrowObject12{
    def main(args:Array[String]){  
        var e = new ExceptionExample12()
        e.validate(10)  
   
    }  
}  
