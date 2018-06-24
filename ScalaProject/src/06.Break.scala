import scala.util.control.Breaks._  // Importing  package 
object Break {
//In scala, there is no break statement but you can do it by using break method and by importing scala.util.control.Breaks._ package. 
  def main(args: Array[String]) {
    breakable {                     // Breakable method to avoid exception  
      for (i <- 1 to 10 by 2) {
        if (i == 7) {
          break
        } else {
          println(i)
        }
      }
    }
  }
}

//TP
//As such there is no built-in break statement available in Scala but if you are running Scala version 2.8, then there is a way to use break statement.
import scala.util.control._

object Demo5 {
   def main(args: Array[String]) {
      var a = 0;
      var b = 0;
      val numList1 = List(1,2,3,4,5);
      val numList2 = List(11,12,13);

      val outer = new Breaks;
      val inner = new Breaks;

      outer.breakable {
         for( a <- numList1){
            println( "Value of a: " + a );
            
            inner.breakable {
               for( b <- numList2){
                  println( "Value of b: " + b );
                  
                  if( b == 12 ){
                     inner.break;
                  }
               }
            } // inner breakable
         }
      } // outer breakable.
   }
}