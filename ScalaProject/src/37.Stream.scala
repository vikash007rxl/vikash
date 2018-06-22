
//Stream is a lazy list. It evaluates elements only when they are required. This is a feature of scala. Scala supports lazy computation. It increases performance of your program.

object StreamObject{  
    def main(args:Array[String]){  
        val stream = 100 #:: 200 #:: 85 #:: Stream.empty  
        println(stream)  
        stream.foreach((dd:Int)=>println(dd+ ""))
    }  
}  

//O/p:-Stream(100, ?)

//In the output, you can see that second element is not evaluated. Here, a question mark is displayed in place of element. Scala does not evaluate list until it is required.

//Applying Predefined Methods

import scala.collection.immutable._  
object StreamObject1{  
    def main(args:Array[String]){  
        var stream = 100 #:: 200 #:: 85 #:: Stream.empty  
        println(stream)  
        var stream2 = (1 to 10).toStream  
        println(stream2)  
        var firstElement = stream2.head  
        println(firstElement)  
        println(stream2.take(10))  
        println(stream.map{_*2})
    }  
}  