object Functions {

  def main(args: Array[String]) {

    println(test(4))

  }

  def test1(dd: Int) = {
    dd + 33
  }
  //OR type is mendatory when u use return keyword
  // return type is mendatory in case of recursssive call

  def test(dd: Int): Int = {
    return (dd + 33)
  }

  println("----------------Function Parameter with Default Value------------------");

  var result1 = functionExample(15, 2) // Calling with two values  
  var result2 = functionExample(15) // Calling with one value  
  var result3 = functionExample() // Calling without any value  
  println(result1 + "\n" + result2 + "\n" + result3)

  def functionExample(a: Int = 0, b: Int = 0): Int = { // Parameters with default values as 0  
    a + b
  }

  println("----------------Named Parameter------------------");
  
  // You can pass named parameters in any order and can also pass values only.
  
   var result5 = functionExample1(a = 15, b = 2)    // Parameters names are passed during call  
        var result6 = functionExample1(b = 15, a = 2)    // Parameters order have changed during call  
        var result7 = functionExample1(15,2)             // Only values are passed during call  
        println(result5+"\n"+result6+"\n"+result7)  
        
    def functionExample1(a:Int, b:Int):Int = {  
        a+b  
    }  
}

//functions can be defined with multiple parameter list
object function2{
  def fun(a:Int,b:Int)(c:Int)= (a+b)*c

  def main(args: Array[String]): Unit = {
    println(fun(2,5)(6))
  }
}

// anonymus function without any name
//(x:Int)=>x+1
//println(res()(10))

object A1{
  def test = "Hi"
}

object TestA{
def main(args: Array[String]): Unit = {
  println(A1.test)
}
}



//You can create function by using def keyword. 
//You must mention return type of parameters while defining function and return type of a function is optional. 
//If you don't specify return type of a function, default return type is Unit.

//You can create function with or without = (equal) operator. If you use it, function will return value. 
//If you don't use it, your function will not return anything and will work like subroutine.

//Scala functions don?t use return statement. Return type infers by compiler from the last expression or statement present in the function.

//In Scala function, you can specify the names of parameters during calling the function. You can pass named parameters in any order and can also pass values only.

//A function, that does not return anything can return a Unit that is equivalent to void in Java.and indicates that function does not return anything.

//functions are expressions that provides the code resuablity

//Syntax1:- val <functionname> =(<parameters>)=><expression>
//Syntax2:- val <functionname> =(<parameters>)=>{ // blocks of statmenets}

object function1{
  def main(args: Array[String]): Unit = {
    var sum = (i:Int,j:Int)=> i+j
     var sum1 = (i:Int,j:Int)=> {i+j}
    println(sum(2,4))
    println(sum1(2,4))
  }
}

// PROCEDURES
//suntax is same as function but missing '=' sign in return place
//Syntax1:- def <procedurename> (<parameters>) {< // blocks of statmenets}

   // def pro(a:Int,b:Int): Unit {
   //   println(a+b)
   // }

//u can assign value/expression/block
class Mq {
  var a=2
  var b=4
  def sum()=a+b
  def sum1() ={a+b}
  def sum2():Int = {
   return  a+b}  // if u want to return something then = is mendatory
}


//we can use operater charecter im method name also
class Test12312{
  def *(a:Int,b:Int)={ a+b;println(a+b)} // can keep two staemnet in single line with : seprater
}

object TestObj{
  def main(args: Array[String]): Unit = {
    var t =new Test12312
    t.*(1,2)
    t *(1,2)

  }
}

//Implicit Parameters
//its a parameter to a method or constructor that market as implicit
//when a parameter value is not supplied then the compiler will search for an implicit value defined within the scope
//condition of implicit :-
//1.a single implicit keyword per paramter
//2. allowed one time only and at the first place
//3.makes all parameter implicit

class Implicit{
  def ImMethod(implicit i:Int,j:String)=println(i +"/t"+j)
}

object ImplObject{
  def main(args: Array[String]): Unit = {
    var ss = new Implicit
  //  ss.ImMethod   //CTE
   // ss.ImMethod(2,"ff")  //OK as usual
    implicit var k:Int=66
    implicit var u:String="vik"
    ss.ImMethod   //in implict case method can call in that way without parameter

  }
}