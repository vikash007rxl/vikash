

//Array is a collection of mutable values.

class ArrayExample{  
    var arr = Array(1,2,3,4,5)      // Creating single dimensional array  
    def show(){  
        for(a<-arr)                       // Traversing array elements  
            println(a)  
        println("Third Element  = "+ arr(2))        // Accessing elements by using index  
    }  
}  
  
object ArrayExampleObj{  
    def main(args:Array[String]){  
        var a = new ArrayExample()  
        a.show()  
    }  
}

//we have created an array by using new keyword which is used to initialize memory for array. The entire array elements are set to default value, you can assign that later in your code.

class ArrayEample2{

  var arr = new Array[Int](5)

  def show() {
    for (a <- arr) { // Traversing array elements
      println(a)
    }
    println("Third Element before assignment = " + arr(2)) // Accessing elements by using index
    arr(2) = 10 // Assigning new element at 2 index
    println("Third Element after assignment = " + arr(2))
  }
}  
  
object ArrayExampeObj3{  
    def main(args:Array[String]){  
        var a = new ArrayEample2()  
        a.show()  
    }  
}  

//You can pass array as an argument to function during function call. 

class ArrayExample4{  
    def show(arr:Array[Int]){  
        for(a<-arr)                // Traversing array elements  
            println(a)  
        println("Third Element = "+ arr(2))        // Accessing elements by using index  
    }  
}  
  
object ArrayExampeObj4{  
    def main(args:Array[String]){  
        var arr = Array(1,2,3,4,5,6)    // creating single dimensional array  
        var a = new ArrayExample4()  
        a.show(arr)                     // passing array as an argument in the function  
    }  
}  

//Iterating By using Foreach Loop


class ArrayExample5{  
    def show(arr:Array[Int]){  
        arr.foreach((s:Int) => println(s + " "))
    }  
}  
  
object ArrayExampeObj5{  
    def main(args:Array[String]){  
        var arr = Array(1,2,3,4,5,6)    // creating single dimensional array  
        var a = new ArrayExample5()  
        a.show(arr)                     // passing array as an argument in the function  
    }  
}  

//TP
object Demo6 {
   def main(args: Array[String]) {
      var myList = Array(1.9, 2.9, 3.4, 3.5)
      
      // Print all the array elements
      for ( x <- myList ) {
         println( x )
      }

      // Summing all elements
      var total = 0.0;
      
      for ( i <- 0 to (myList.length - 1)) {
         total += myList(i);
      }
      println("Total is " + total);

      // Finding the largest element
      var max = myList(0);
      
      for ( i <- 1 to (myList.length - 1) ) {
         if (myList(i) > max) max = myList(i);
      }
      
      println("Max is " + max);
   }
}

//Concatenate Arrays

import Array._

object Demo7 {
   def main(args: Array[String]) {
      var myList1 = Array(1.9, 2.9, 3.4, 3.5)
      var myList2 = Array(8.9, 7.9, 0.4, 1.5)

      var myList3 =  concat( myList1, myList2)
      var myList4 =  myList1++myList2
      
      // Print all the array elements
      for ( x <- myList3) {
         println( x )
      }
      for ( y <-myList4) {
         println( y )
      }
   }
}

//Create Array with Range

//Use of range() method to generate an array containing a sequence of increasing integers in a given range. You can use final argument as step to create the sequence; if you do not use final argument, then step would be assumed as 1.

import Array._

object Demo8 {
   def main(args: Array[String]) {
      var myList1 = range(10, 20, 2)
      var myList2 = range(10,20)

      // Print all the array elements
      for ( x <- myList1 ) {
         print( " " + x )
      }
      
      println()
      for ( x <- myList2 ) {
         print( " " + x )
      }
   }
}