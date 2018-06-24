
//Scala provides only three types of access modifiers, which are given below:
//
//No modifier
//Protected
//Private

//Modifier	Outside package	Package	Class	Subclass	Companion
//No access modifier	Yes	Yes	Yes	Yes	Yes
//Protected	No	No	Yes	Yes	Yes
//Private	No	No	Yes	No	Yes

//private access modifier is used to make data accessible only within class in which it is declared. It is most restricted and keeps your data in limited scope. Private data members does not inherit into subclasses.
class AccessExample{  
     private var a:Int = 10  
     def show(){  
         println(a)  
     }  
}  
object AccessExampleObj1{  
    def main(args:Array[String]){  
        var p = new AccessExample()  
   //     p.a = 12        //variable a in class AccessExample cannot be accessed in AccessExample
        p.show()  
    }  
}  

//Protected access modifier is accessible only within class, sub class and companion object.

class AccessExample1{  
     protected var a:Int = 10  
}  
class SubClass extends AccessExample1{  
    def display(){  
        println("a = "+a)  
    }  
}  
object AccessExampleObj2{  
    def main(args:Array[String]){  
        var s = new SubClass()  
        s.display()  
    }  
} 

//when you don't mention any access modifier, it is treated as no-access-modifier. It is same as public in java. It is least restricted and can easily accessible from anywhere inside or outside the package.

class AccessExample3{  
     var a:Int = 10  
     def show(){  
         println(" a = "+a)  
     }  
}  
  
object AccessExampleObj3{  
    def main(args:Array[String]){  
        var a = new AccessExample()  
        a.show()  
    }  
}  
//TP
//access modifiers private and protected, and if we are not using either of these two keywords, then access will be assumed as public.There is no explicit modifier for public members. 
class Outer {
   class Inner {
      private def f() { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
//   (new Inner).f() // Error: f is not accessible
}
//Java would permit both accesses because it lets an outer class access private members of its inner classes.

package p {
   class Super {
      protected def f() { println("f") }
   }
   
   class Sub extends Super {
      f()
   }
   
   class Other {
//      (new Super).f() // Error: f is not accessible
   }
}

//A protected member is only accessible from subclasses of the class in which the member is defined.

//In Java, the latter access would be still permitted because ‘Other’ class is in the same package as ‘Sub’ class.

//Public Members
class Outer1 {
   class Inner {
      def f() { println("f") }
      
      class InnerMost {
         f() // OK
      }
   }
   (new Inner).f() // OK because now f() is public
}