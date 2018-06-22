// Abstraction is a process in which we hide complex implementation details and show only functionality to the user.

// we can achieve abstraction by using abstract class and trait.

abstract class Bike1{  
    def run()  
}  
  
class Hero extends Bike1{  
    def run(){  
        println("running fine...")  
    }  
}  
  
object AbstractClass{  
    def main(args: Array[String]){  
        var h = new Hero()  
        h.run()  
    }  
}  

//Scala Abstract Class Example: Having Constructor, Variables and Abstract Methods

abstract class Bike2(a:Int){             // Creating constructor  
    var b:Int = 20                      // Creating variables  
    var c:Int = 25  
    def run()                           // Abstract method  
    def performance(){                  // Non-abstract method  
        println("Performance awesome")  
    }  
}  
  
class Hero1(a:Int) extends Bike2(a){  
    c = 30  
    def run(){  
        println("Running fine...")  
        println("a = "+a)  
        println("b = "+b)  
        println("c = "+c)  
    }  
}  
  
object AbsClass{  
    def main(args: Array[String]){  
        var h = new Hero1(10)  
        h.run()  
        h.performance()  
    }  
}  

//only the primary constructor can pass parameters to the base constructor.

import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}

object Demo {
   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);

      // Move to a new location
      loc.move(10, 10, 5);
   }
}