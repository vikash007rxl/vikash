
//Vector is a general-purpose, immutable data structure. It provides random access of elements. It is good for large collection of elements.
import scala.collection.immutable._  
object VectorObject{  
    def main(args:Array[String]){  
        var vector:Vector[Int] = Vector(5,8,3,6,9,4) //Or  
        var vector2 = Vector(5,2,6,3)  
        var vector3 = Vector.empty  
        println(vector)  
        println(vector2)  
        println(vector3)  
    }  
}  


import scala.collection.immutable._  
object VectorObject1{  
    def main(args:Array[String]){  
        var vector = Vector("Hocky","Cricket","Golf")  
        var vector2 = Vector("Swimming")  
        print("Vector Elements: ")  
        vector.foreach((element:String) => print(element+" "))  
        var newVector  = vector :+ "Racing"                             // Adding a new element into vector  
        print("\nVector Elements after adding: ")  
        newVector.foreach((element:String) => print(element+" "))  
        var mergeTwoVector = newVector ++ vector2                       // Merging two vector  
        print("\nVector Elements after merging: ")  
        mergeTwoVector.foreach((element:String) => print(element+" "))  
        var reverse = mergeTwoVector.reverse                            // Reversing vector elements  
        print("\nVector Elements after reversing: ")  
        reverse.foreach((element:String) => print(element+" "))  
        var sortedVector = mergeTwoVector.sorted                        // Sorting vector elements  
        print("\nVector Elements after sorting: ")  
        sortedVector.foreach((element:String) => print(element+" "))  
    }  
}  