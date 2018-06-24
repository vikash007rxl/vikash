//Scala case classes are just regular classes which are immutable by default and decomposable through pattern matching.
//
//It uses equal method to compare instance structurally. It does not use new keyword to instantiate object.
//
//All the parameters listed in the case class are public and immutable by default.

//Case class is  class with special feature for holding the data
//class parameters are automatically fields with easily printable and comparable
case class CaseClass (a:Int,b:Int)

object CaseClassesAndCaseObject {

  def main(args: Array[String]): Unit = {
    var s= CaseClass(2,4)                // Creating object of case class  
    println (s.a + " " + s.b)            // Accessing elements of case class  
  }

}
//Case classes support pattern matching. So, you can use that in patterns. Following is the example of case classes and pattern.
//A case class which has no arguments is declared as case object instead of case class. case object is serializeable by default.

trait SuperTrait  
case class CaseClass1(a:Int,b:Int) extends SuperTrait  
case class CaseClass2(a:Int) extends SuperTrait         // Case class  
case object CaseObject extends SuperTrait               // Case object  
object MainObject12{  
    def main(args:Array[String]){  
        callCase(CaseClass1(10,10))  
        callCase(CaseClass2(10))  
        callCase(CaseObject)  
    }  
    def callCase(f:SuperTrait) = f match{  
        case CaseClass1(f,g)=>println("a = "+f+" b ="+g)  
        case CaseClass2(f)=>println("a = "+f)  
        case CaseObject=>println("No Argument")  
    }  
}  

//Matching using Case Classes
//The case classes are special classes that are used in pattern matching with case expressions. Syntactically, these are standard classes with a special modifier: case.

object Demo9 {
   def main(args: Array[String]) {
      val alice = Person("Alice", 25)
      val bob =  Person("Bob", 32)
      val charlie = Person("Charlie", 32)
      
      val list =List(alice, bob, charlie)
      println(list.filter((p)=>p.age==25)) // important
      for (person <- list) {
         person match {
            case Person("Alice", 25) => println("Hi Alice!")
            case Person("Bob", 32) => println("Hi Bob!")
            case Person(name, age) => println(
               "Age: " + age + " year, name: " + name + "?")
         }
      }
   }
   case class Person(name: String, age: Int)
}

//Adding the case keyword causes the compiler to add a number of useful features automatically. The keyword suggests an association with case expressions in pattern matching.

//First, the compiler automatically converts the constructor arguments into immutable fields (vals).

//Second, the compiler automatically implements equals, hashCode, and toString methods to the class, which use the fields specified as constructor arguments.

//Finally, also, the body of Person class becomes empty because there are no methods that we need to define!

// case classs equivalent to java class like


//public class Person {
//	public String name;
//
//	public Person(String name) {
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return name.toString();
//	}
//
//	@Override
//	public boolean equals(Person arg0) {
//		// TODO Auto-generated method stub
//		return name.equals(arg0.name);
//	}
//}
//}

//above code same as case class Person(name: String, age: Int)

//case classes are compared by structure and not by reference.

object caseClass12{
 case class Person123(a:Int,b:Int)
  def main(args: Array[String]): Unit = {
 var a=Person123(1,3)
    var b=Person123(1,3)
    println(a==b) //true bcz cmpare contant but in the case of java it will be false
  }
}

//you can create deep copy of an instance of a case class using copy method

object caseClassCopy{
  case class Person123(a:Int,b:Int)
  def main(args: Array[String]): Unit = {
    var a=Person123(1,3)
    var b=a.copy()
    println(a==b)
    var c=a.copy(b=99)
    println(a==c)
  }
}