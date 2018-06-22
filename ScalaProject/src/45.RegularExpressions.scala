

import scala.util.matching.Regex

object RegularExpressions {
   def main(args: Array[String]) {
      val pattern = "Scala".r // val pattern = "Scala".r()
      val str = "Scala is Scalable and cool"
      println(pattern findFirstIn str)
   }
}

import scala.util.matching.Regex

object RegularExpressions1 {
   def main(args: Array[String]) {
      val pattern = new Regex("(S|s)cala")
      val str = "Scala is scalable and cool"
      
      println((pattern findAllIn str).mkString(",")) //this findAllIn   will return a collection of all matching words.
       val str1 =  pattern findAllIn str
       str1.foreach((f:Any)=>println(f+""))
   }
}

//You can make use of the mkString( ) method to concatenate the resulting list and you can use a pipe (|) to search small and capital case of Scala and you can use Regex constructor instead or r() method to create a pattern.

//If you would like to replace matching text, we can use replaceFirstIn( ) to replace the first match or replaceAllIn( ) to replace all occurrences.

object RegularExpressions2 {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
      val str = "Scala is scalable and cool"
      
      println(pattern replaceFirstIn(str, "Java"))
   }
}

import scala.util.matching.Regex

object RegularExpressions3 {
   def main(args: Array[String]) {
      val pattern = new Regex("abl[ae]\\d+")
      val str = "ablaw is able1 and cool"
      
      println((pattern findAllIn str).mkString(","))
   }
}