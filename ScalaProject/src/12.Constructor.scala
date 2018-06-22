//Scala Primary Constructor Example

class Constructor(id:Int, name:String){  
    def showDetails(){  
        println(id+" "+name);  
    }  
}  
  
object MainObject1{  
  def main(args: Array[String]) {
   var s = new Constructor(101,"Rama");
 //   var s = new Constructor; //bcz default const not there hence failure
    s.showDetails()
}
}  

//constructor is not special method. Scala provides primary and any number of auxiliary constructors. 

// if you don't specify primary constructor, compiler creates a constructor which is known as primary constructor. All the statements of class body treated as part of constructor. It is also known as default constructor.

//Scala provides a concept of primary constructor with the definition of class. You don't need to define explicitly constructor if your code has only one constructor. It helps to optimize code. You can create primary constructor with zero or more parameters.

//Scala Secondary (auxiliary) Constructor

//You can create any number of auxiliary constructors in a class. You must call primary constructor from inside the auxiliary constructor. this keyword is used to call constructor from other constructor. When calling other constructor make it first line in your constructor.

class Student4(id:Int, name:String){  
    var age:Int = 0
    def showDetails(){  
        println(id+" "+name+" "+age)  
    }  
    def this(id:Int, name:String,age:Int){  
        this(id,name)       // Calling primary constructor, and it is first line  
        this.age = age  
    }
  println("i am part of primary constructor")
  // anything we can place whithin class body, all are pert of pirmany constructor(method will not run only)
}  
 // Following are allowed as a part of primary constaructor
//1.any staement or expression
//2.control statement
//3.method calls

object MainObject2{  
    def main(args:Array[String]){  
        var s = new Student4(101,"Rama",20);
        s.showDetails()
    }  
}  


//Constructor Overloading

class Test1(a:Int){
  var d=""
  def this (a:Int, b:String)
  {
    this(a)
    this.d=b
  }
  
  def method1{
    println (a + ""+ d)
  }
  
}

object Main2{
  
  def main(args: Array[String]) {
  new Test1(2)
  new Test1(3,"fg").method1
}


//a scala class can contain only primary constructor or both primary and auxilarry constructor
// a scala class can have one and only one primary constuctor but can have multiple auxilaary constructor
  // auxilllary con also called secondary con
  //Each auxillary const should call one of the previous defined constructor

//we can use var or val to define primary constructor parameters and all will be public

//when we dont use var or val in primary constructor then scala compiler dont generate setter or getter ,
// and these vallue will be private value , which will be visible in the same class.

class AB(a:Int){
}
object Con{
  def main(args: Array[String]): Unit = {
    var ab =new AB(11)
   // println(ab.a)// CTE bcz only visible in AB class

  }
}}



class AB1(b:Int){
 // var b=44 // b aready defined
}
object Con1{
  def main(args: Array[String]): Unit = {
    var ab =new AB1(11)
  //  println(ab.b)// CTE bcz only visible in AB class

  }
}

