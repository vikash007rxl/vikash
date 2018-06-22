
//allows inserting and retrieving elements in a first-in-first-out (FIFO) manner.
import scala.collection.immutable._  
object QueueObject{  
    def main(args:Array[String]){  
        var queue = Queue(1,5,6,2,3,9,5,2,5)  
        var queue2:Queue[Int] = Queue(1,5,6,2,3,9,5,2,5)  
        println(queue)    
        println(queue2)  
    }  
}  


import scala.collection.immutable._  
object QueueObject1{  
    def main(args:Array[String]){  
        var queue = Queue(1,5,6,2,3,9,5,2,5)  
        print("Queue Elements: ")  
        queue.foreach((element:Int)=>print(element+" "))    
        var firstElement = queue.front  
        print("\nFirst element in the queue: "+ firstElement)         
        var enqueueQueue = queue.enqueue(100)  
        print("\nElement added in the queue: ")  
        enqueueQueue.foreach((element:Int)=>print(element+" "))  
        var dequeueQueue = queue.dequeue  
        print("\nElement deleted from this queue: "+ dequeueQueue)  
    }  
}  