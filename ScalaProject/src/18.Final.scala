//Final is a keyword, which is used to prevent inheritance of super class members into derived class. You can declare final variables, methods and classes also.

//You can't override final variables in subclass.

class Vehicle122{  
     final val speed:Int = 60  
}

//You can make any method to final if you don't want to get it overridden. 

class Vehicle1{  
     final def show(){  
         println("vehicle is running")  
     }  
}  

//Final class can't be inherited. If you make a class final, it can't be extended further.

final class Vehicle2{  
     def show(){  
         println("vehicle is running")  
     }  
  
}  