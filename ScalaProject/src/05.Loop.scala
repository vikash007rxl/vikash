
object Loop {

  def main(args: Array[String]) {
    println("---------------last index including--------------------");
    for (a <- -1 to 5) {
      println(a);
    }

    println("-----------------last index excluding------------------");
    for (a <- -1 until 5) {
      println(a);
    }

    println("-----------------if condition along with for ------------------");
    for (a <- -1 until 5 if a % 2 == 0) {
      println(a);
    }

    //    In the above example, we have used yield keyword which returns a result after completing of loop iterations. 
    //    The for use buffer internally to store iterated result and after finishing all iterations it yields the final result from that buffer. 
    //    It does not work like imperative loop.

    println("-----------------yield------------------");
    var result = for (a <- 1 to 5) yield a

    for (i <- result) {
      println(i)
    }

    println("-----------------List Itereartions------------------");

    var qa = List(1, 2, 3, 4);

    for (w <- qa)
      println(w)

    println("-----------------For each to iterate collection------------------");

    var list = List(1, 3, "g", 5)
    
    // 1st way
    list.foreach {
      println
    }
    
    //2nd way
    list.foreach(println)
    println
    
    //3rd way
    list.foreach((abc: Any) => print(abc + " "))
    
    println("-----------------for-loop Example using by keyword------------------");
    
    //The by keyword is used to skip the iteration. When you code like: by 2 it means, this loop will skip all even iterations of loop.
    
    for(i <- 1 to 10 by 3)
    {
      println(i)
    }

  }

}

object Demo1 {
   def main(args: Array[String]) {
      var a = 0;
      var b = 0;
      
      // for loop execution with a range// inner loop
      for( a <- 1 to 3; b <- 1 to 3){
         println( "Value of a: " + a );
         println( "Value of b: " + b );
      }
   }
}

// multiple filter condition
object Demo2 {
   def main(args: Array[String]) {
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with multiple filters
      for( a <- numList if a != 3; if a < 8 ){
         println( "Value of a: " + a );
      }
   }
}

// yield
object Demo3 {
   def main(args: Array[String]) {
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      // for loop execution with a yield
      var retVal = for{ a <- numList if a != 3; if a < 8 }yield a

      // Now print returned values using another loop.
      for( a <- retVal){
         println( "Value of a: " + a );
      }
   }
}