object VariablesAndDataTypes {

  //Mutable Variable
  var data =100
  data=34
  
 //  Scala is a type infers language so you don?t need to specify data type explicitly. You can also mention data type of variable explicitly as we have used in below.
  val data1:Int = 100 
  
  //Immutable Variable
  val data3 = 55
//  data3 = 45
  
  //in scala there is no concept of primitive data types every type is an object and starts with capital letter. Boolean,Long
  
//Multiple assignments
//Scala supports multiple assignments. If a code block or method returns a Tuple , the Tuple can be assigned to a val variable. 
def main(args:Array[String]){  
         val (myVar1, myVar2) = Pair(40, "Foo")
        println (myVar1)
         
        } 
  
}

//When you assign an initial value to a variable, the Scala compiler can figure out the type of the variable based on the value assigned to it. This is called variable type inference. 

