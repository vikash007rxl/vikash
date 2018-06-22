
//Scala Option[ T ] is a container for zero or one element of a given type. An Option[T] can be either Some[T] or None object, which represents a missing value. For instance, the get method of Scala's Map produces Some(value) if a value corresponding to a given key has been found, or None if the given key is not defined in the Map.



object Options {
   def main(args: Array[String]) {
      val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("capitals.get( \"France\" ) : " +  capitals.get( "France" ))
      println("capitals.get( \"India\" ) : " +  capitals.get( "India" ))
   }
}

//0/p:-
//capitals.get( "France" ) : Some(Paris)
//capitals.get( "India" ) : None

object Demo19 {
   def main(args: Array[String]) {
      val capitals = Map("France" -> "Paris", "Japan" -> "Tokyo")
      
      println("show(capitals.get( \"Japan\")) : " + show(capitals.get( "Japan")) )
      println("show(capitals.get( \"India\")) : " + show(capitals.get( "India")) )
   }
   
   def show(x: Option[String]) = x match {
      case Some(s) => s
      case None => "?"
   }
}

//o:p:-
//show(capitals.get( "Japan")) : Tokyo
//show(capitals.get( "India")) : ?

//getOrElse() Method

object Demo20 {
   def main(args: Array[String]) {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.getOrElse(0): " + a.getOrElse(0) )
      println("b.getOrElse(10): " + b.getOrElse(10) )
   }
}
//a.getOrElse(0): 5
//b.getOrElse(10): 10

// isEmpty() Method
object Demo21 {
   def main(args: Array[String]) {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.isEmpty: " + a.isEmpty )
      println("b.isEmpty: " + b.isEmpty )
   }
}

//a.isEmpty: false
//b.isEmpty: true


