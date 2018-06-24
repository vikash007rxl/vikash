//It maintains insertion order and returns ListMap. This collection is suitable for small elements.

//You can create empty ListMap either by calling its constructor or using ListMap.empty method.

import scala.collection.immutable._  
object ListMapObject{  
    def main(args:Array[String]){  
        var listMap = ListMap("Rice"->"100","Wheat"->"50","Gram"->"500")    // Creating listmap with elements  
        var emptyListMap = new ListMap()            // Creating an empty list map  
        var emptyListMap2 = ListMap.empty           // Creating an empty list map  
        println(listMap)  
        println(emptyListMap)  
        println(emptyListMap2)  
    }  
}  