
// trait is a collection of abstract and non-abstract methods. 


// Any variable which is declared by using val or var but not initialized is considered abstract.

//If a class extends a trait but does not implement the members declared in that trait, it must be declared abstract.

//Unlike class inheritance, in which each class must inherit from just one superclass, a class can mix in any number of traits.


trait Printable{  
    def print()  
}  
  
class A4 extends Printable{  
    def print(){  
        println("Hello")  
    }  
}  
  
object TraitObject{  
    def main(args:Array[String]){  
        var a = new A4()  
        a.print()  
    }  
}  

//If a class implements multiple traits, it will extend the first trait, class, abstract class. with keyword is used to extend rest of the traits.

// you can treat trait as abstract class also. In scala, trait is almost same as abstract class except that it can't have constructor.

//You can't extend multiple abstract classes but can extend multiple traits.

trait Printable1{  
    def print()         // Abstract method  
    def show(){         // Non-abstract method  
        println("This is show method")  
    }  
}  

trait Printable2{  
    def show1(){         // Non-abstract method  
        println("This is show1 method")  
    }  
}
  
class A6 extends Printable1 with Printable2{  
    def print(){  
        println("This is print method")  
    }  
}  
  
object TraitObject1{  
    def main(args:Array[String]){  
        var a = new A6()  
        a.print()  
        a.show()  
        a.show1()  
    }  
}

//trait can be used just like jave interface
//trait cannt be instantiated
//class and object can extend traits
//when a class implements multiple traits, it will extend the first trait(or a claass or abstract classs)
 //and then use with other triats
//if super class is concerete class then in subclass must use override
//if super is trait and method is undefind then dont use override
//if super is trait and method is defined then must use override