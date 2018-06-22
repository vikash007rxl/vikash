

//A tuple is a collection of elements in ordered form. I
//You can use tuple to store any type of data. You can store similar type or mix type data also. You can use it to return multiple values from a function

object Tuples {
   def main(args:Array[String]){  
        var tuple = (1,5,8,6,4)                     // Tuple of integer values  
        var tuple2 = ("Apple","Banana","Gavava")        // Tuple of string values  
        var tuple3 = (2.5,8.4,10.50)                // Tuple of float values  
        var tuple4 = (1,2.5,"India")                // Tuple of mix type values  
        println(tuple)  
        println(tuple2)  
        println(tuple3)  
        println(tuple4)  
        tuple.productIterator.foreach((aa:Any) => println(aa+" "))
        //OR
         tuple.productIterator.foreach(println)
         println(tuple._1) // Fetching first value  
        println(tuple._2) // Fetching second value 
    }  
}

//Accessing Tuple Elements

//we are using productIterator for iterating tuple elements

//You can return multiple values by using tuple. Function does not return multiple values but you can do this with the help of tuple.

object TuplesObject{  
    def main(args:Array[String]){  
        var tupleValues = tupleFunction()  
        println("Iterating values: ")  
        tupleValues.productIterator.foreach(println)    // Iterating tuple values using productIterator  
    }  
    def tupleFunction()={  
        var tuple = (1,2.5,"India")  
        tuple  
    }  
}  

object Tuple1{
  var tuple = (1,5,8,6,4)                     // Tuple of integer values
  var tuple2 = ("Apple","Banana","Gavava")        // Tuple of string values
  var students=Array(tuple,tuple2,(1,2,3))
  def main(args: Array[String]): Unit = {

    println(students.length)
    println(students.size)

    for(st<- students)
      println(st)
  }
}

