
//Scala offers a new mechanism to create strings from your data. It is called string interpolation. String interpolation allows users to embed variable references directly in processed string literals. 
//Scala provides three string interpolation methods: s, f and raw.




class StringInterpolationExample{  
    var pi = 3.14  
    var version = 2.12
    var s1 = "Scala string example"  
    def show(){  
        println(s"value of pi = $pi") //String Interpolation Example By using s Method
         println(s"This is $pi")
//         The f method is used to format your string output. It is like printf function of c language which is used to produce formatted output. 
//         You can pass your variables of any type in the print function.
         println(f"This is $s1%s, scala version is $version%2.2f")  
    }  
}  
  
object StringInterpolationObj{  
    def main(args:Array[String]){  
        var s = new StringInterpolationExample()  
        s.show()  
    }  
}  

//String Interpolation Example By using raw Method

class StringInterpolationExample1{  
    var s1 = "Scala \tstring \nexample"      
    var s2 = raw"Scala \tstring \nexample"      
    def show(){  
        println(s1)  
        println(s2)  
    }  
}  
  
object StringInterpolationObj2{  
    def main(args:Array[String]){  
        var s = new StringInterpolationExample1()  
        s.show()  
    }  
}  
//String interpolater can also process arbitrary expressions.
//Any arbitrary expression can be embedded in ‘${}’.
object StringInterpolationObj3 {
   def main(args: Array[String]) {
      val name = "James"
      
      println(s"Hello, $name")
      println(s"1 + 1 = ${1 + 1}")
   }
}