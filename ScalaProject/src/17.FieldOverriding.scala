
//you must use either override keyword or override annotation when you are overriding methods or fields of super class
//you can override only those variables which are declared by using val keyword in both classes. 
class Vehicle11{  
     val speed:Int = 60  
  
}  
class Bike11 extends Vehicle11{  
   override val speed:Int = 100     // Override keyword  
    def show(){  
        println(speed)  
    }  
}  
object FeildOverrinding{  
    def main(args:Array[String]){  
        var b = new Bike11()  
        b.show()  
    }  
}   


