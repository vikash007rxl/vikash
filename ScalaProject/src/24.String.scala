
// It is index based data structure and use linear approach to store data into memory. String is immutable in scala like java.

//we are modifying the string and assigning it to a variable so that we can keep reference of modified string. Here, a new string object is created after modification. The s1 variable now refers to new string object. The old string object is still available in the memory but does not have any reference.


class StringExample{  
    var s1 = "Scala string example"  
    s1 = "This is "+s1          
    def show(){  
        println(s1)  
    }  
}  
  
object StringExampleObj{  
    def main(args:Array[String]){  
        var s = new StringExample()  
        s.show()  
    }  
}  

//you can compare two string objects by using == (equal) method.

class StringExample1{  
    var s1 = "Scala string example"  
    var s2 = "Hello Scala"  
    var s3 = "Hello Scala"  
    def show(){  
        println(s1 == s2)  
        println(s2 == s3)  
    }  
     def show1(){  
        println(s1.equals(s2))  
        println(s2.equals(s3))  
    }  
}  
  
object StringExampleObj1{  
    def main(args:Array[String]){  
        var s = new StringExample1()  
        s.show() 
        s.show1()
    }  
}  

//compareTo() method compares the given string with current string lexicographically. It returns positive number, negative number or 0.

//s1 > s2 => positive number    
//s1 < s2s2 => negative number    
//s1 == s2 => 0    

class StringExample2{  
    var s1 = "Scala string example"  
    var s2 = "Hello Scala"  
    var s3 = "Hello Scala"  
    def show(){  
        println(s1.compareTo(s2))  
        println(s2.compareTo(s3))  
    }  
    
    def other(){  
        println(s1.concat(s2))  
        println(s1.substring(0,5))  
    }  
}  
  
object StringExampleObj2{  
    def main(args:Array[String]){  
        var s = new StringExample2()  
        s.show() 
        s.other()
    }  
}  

object StringExampleObj3 {
   def main(args: Array[String]) {
      var palindrome = "Dot saw I was Tod";
      var len = palindrome.length();
     //replaceAll
      println( palindrome.size);
      println( "String Length is : " + len );
   }
}