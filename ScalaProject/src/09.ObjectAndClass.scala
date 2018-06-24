
// You must initialize all instance variables in the class. 
//  There is no default scope. If you don't specify access scope, it is public. 
//  There must be an object in which main method is defined. 
//  It provides starting point for your program. Here, we have created an example of class.
  
  //when public members are var then public getter and setter
// when public members declared as val then only public getter will be generated

//when private members are var then private getter and setter
// when private members declared as val then only private getter will be generated


class Student{  
    var id:Int = 0;                         // All fields must be initialized  
    var name:String = null;
    val sal:String = "vik"
}  
object MainObject{  
    def main(args:Array[String]){  
        var s = new Student()               // Creating an object  
        println(s.id+" "+s.name);           //internally call getter
        s.id = 4                              //internally call setters
       // s.sal="fff"                        setter method is not for val
    }  
}  
// see javac Student.scala
// then javap scala then u can see auto generated setter and getters
// constructor is created in class definition.

class Student1(a:Int,b:String){

  def test {  // variable=2,construct=1,method=1+4
    println (a + b)
  }

}

object MainObect{
  def main(args: Array[String]) {
       var a= new Student1(4,"6")
       a.test
    a test // called infix notation , when we call none or only a single parameter
}
}

//A class is not declared as public,a source file can contain multiple class and all classes can be public

//By default members of scala class is public and by defalut class is also public in scala.

