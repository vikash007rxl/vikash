
//A closure is a function, whose return value depends on the value of one or more variables declared outside this function.

//The following piece of code with anonymous function.


object Closure {
   def main(args: Array[String]) {
      println( "multiplier(1) value = " +  multiplier(1) )
      println( "multiplier(2) value = " +  multiplier(2) )
   }
   var factor = 3
   val multiplier = (i:Int) => i * factor
}


//There are two free variables in multiplier: i and factor. One of them, i, is a formal parameter to the function. Hence, it is bound to a new value each time multiplier is called. However, factor is not a formal parameter, then what is this? Let us add one more line of code.