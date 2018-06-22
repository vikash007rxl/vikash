object PatternMatching {

  def main(args: Array[String]) {

    var a = 5
    var b= 7
    
    a match {
      case 1 =>
        println("44")
      case 5 if b==4 =>  //pattern matching with pattern guards
        println("dw")
       case 5 if b==7 =>
        println("d")
      case 2 =>
        println("r")
      case 6 =>
        println("dw")
      case _ =>
        println("last")
        
    }
    
   //println (test("test"))
  }
  
 def test(a:Any):Any= a match {
   case 1  => println("One")  
        case "Two" => println("Two")  
        case "Hello" => println("Hello")  
        case _ => println("No") 
}
}

//Underscore (_) is used in the last case for making it default case.

// Any is a class in scala which is a super class of all data types and deals with all type of data.

//Pattern matching is a feature of Scala. It works same as switch case in other languages.
