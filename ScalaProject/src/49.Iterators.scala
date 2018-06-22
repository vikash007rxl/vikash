
//An iterator is not a collection, but rather a way to access the elements of a collection one by one.

object Iterators {
   def main(args: Array[String]) {
      val it = Iterator("a", "number", 2, "words")
      
      while (it.hasNext){
         println(it.next())
      }
      
//      Min & Max Valued Element
      val ita = Iterator(20,40,2,50,69, 90)
      val itb = Iterator(20,40,2,50,69, 90)
      
      println("Maximum valued element " + ita.max )
      println("Minimum valued element " + itb.min )
      
//      Length of the Iterator
      println("Value of ita.size : " + ita.size )
      println("Value of itb.length : " + itb.length )
   }
}