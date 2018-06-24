
//List is used to store ordered elements. It extends LinearSeq trait. 
//It is a class for immutable linked lists. This class is good for last-in-first-out (LIFO), stack-like access patterns.

//It maintains order of elements and can contain duplicates elements also.


import scala.collection.immutable._  
object ListObject{  
    def main(args:Array[String]){  
       var list = List(1,2,3,5,7)  
        var list2:List[Int] = List(1,8,5,6,9,58,23,15,4)  
        println(list)  
        println(list2)  
        // important
        println(list.reduce((sum1,j)=> sum1+j))
        println(list.reduce((max,j)=>  if (max < j) j else max))
        println(list.filter((i) => i<3))
    }  
}  


import scala.collection.immutable._  
import java.text.Normalizer.Form

object ListObject1{  
    def main(args:Array[String]){  
        var list = List(1,8,5,6,9,58,23,15,4)  
        var list2 = List(88,100)  
        print("Elements: ")  
        list.foreach((element:Int) => print(element+" "))        // Iterating using foreach loop  
        print("\nElement at 2 index: "+list(2))             // Accessing element of 2 index  
        var list3 = list ++ list2                               // Merging two list  
        print("\nElement after merging list and list2: ")  
        list3.foreach((element:Int)=>print(element+" "))      
        var list4 = list3.sorted                            // Sorting list  
        print("\nElement after sorting list3: ")  
        list4.foreach((element:Int)=>print(element+" "))    
        var list5 = list3.reverse                           // Reversing list elements  
        print("\nElements in reverse order of list5: ")  
        list5.foreach((element:Int)=>print(element+" ")) 
        val fruit = List.fill(3)("apples") // Repeats apples three times.
      println( "fruit : " + fruit  )
  
    }  
}  
case class Personq(name:String)
object ListObject11{
  
  def main(args: Array[String]): Unit = {
    var plist=List(Personq("vikas"),Personq("puja"))
 
  }
}

//  lists are immutable, which means elements of a list cannot be changed by assignment. Second, lists represent a linked list whereas arrays are flat.
  
object Demo12 {
   def main(args: Array[String]) {
      val fruit = "apples" :: ("oranges" :: ("pears" :: Nil))
      val nums = Nil

      println( "Head of fruit : " + fruit.head )
      println( "Tail of fruit : " + fruit.tail )
      println( "Check if fruit is empty : " + fruit.isEmpty )
      println( "Check if nums is empty : " + nums.isEmpty )
   }
}

//Concatenating Lists
//You can use either ::: operator or List.:::() method or List.concat() method to add two or more lists. 


object Demo13 {
   def main(args: Array[String]) {
      val fruit1 = "apples" :: ("oranges" :: ("pears" :: Nil))
      val fruit2 = "mangoes" :: ("banana" :: Nil)

      // use two or more lists with ::: operator
      var fruit = fruit1 ::: fruit2
      println( "fruit1 ::: fruit2 : " + fruit )
      
      // use two lists with Set.:::() method
      fruit = fruit1.:::(fruit2)
      println( "fruit1.:::(fruit2) : " + fruit )

      // pass two or more lists as arguments
      fruit = List.concat(fruit1, fruit2)
      println( "List.concat(fruit1, fruit2) : " + fruit  )
   }
}

//Tabulating a Function
//You can use a function along with List.tabulate() method to apply on all the elements of the list before tabulating the list. Its arguments are just like those of List.fill: the first argument list gives the dimensions of the list to create, and the second describes the elements of the list. The only difference is that instead of the elements being fixed, they are computed from a function.

object Demo14 {
   def main(args: Array[String]) {
      // Creates 5 elements using the given function.
      val squares = List.tabulate(6)(n => n * n)
      println( "squares : " + squares  )

      val mul = List.tabulate( 4,5 )( _ * _ )      
      println( "mul : " + mul  )
   }
}

object Demo24 {
   def main(args: Array[String]) {
     var list= 10::20::"dd"::Nil
     println(list.length)
     var list1= 10::20::30::List()
     println(list1.length)
   }
}

object Demo25 {
   def main(args: Array[String]) {
     var list= List(List(1,2,3),List(4,5,6)) //iterate list of list
     
     list.foreach(a=>a.foreach(println))
     
     for(temp<-list){
       for(b<-temp){
         println(b)
       }
     }
     
   }
}
   
  