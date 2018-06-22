
//either override keyword or override annotation to override methods from parent class.


class Vehicle{  
    def run(){  
        println("vehicle is running")  
    }  
}  
  
class Bike extends Vehicle{  
     override def run(){  
        println("Bike is running")  
    }  
}  
  
object MethodOverriding{  
    def main(args:Array[String]){  
        var b = new Bike()  
        b.run()  
    }  
}

