
//It is used to store unique elements in the set. It does not maintain any order for storing elements. You can apply various operations on them. It is defined in the Scala.collection.immutable package.
import scala.collection.immutable._  
object SetObject{
  def main(args: Array[String]) {
    val set1 = Set() // An empty set
    val games = Set("Cricket", "Football", "Hocky", "Golf") // Creating a set with elements
    println(set1)
    println(games)
    println(games.head) // Returns first element present in the set
    println(games.tail) // Returns all elements except first element.
    println(games.isEmpty) // Returns either true or false

    println ("+++++++++++++++++++++++++++++++++++++++++++++++++++")
    val alphabet = Set("A", "B", "C", "D", "E")
    val mergeSet = games ++ alphabet // Merging two sets
    println("Elements in games set: " + games.size) // Return size of collection
    println("Elements in alphabet set: " + alphabet.size)
    println("Elements in mergeSet: " + mergeSet.size)
    println(mergeSet)
    println ("+++++++++++++++++++++++++++++++++++++++++++++++++++")
    println("Golf exists in the set : "+games.contains("Golf"))  
            println("Racing exists in the set : "+games.contains("Racing"))  

  }  
}  

import scala.collection.immutable._  
object SetObject1{  
        def main(args:Array[String]){  
            var games = Set("Cricket","Football","Hocky","Golf")  
            println(games)  
            games += "Racing"               // Adding new element  
            println(games)  
            games += "Cricket"              // Adding new element, it does not allow duplicacy.  
            println(games)  
            games -= "Golf"             // Removing element  
            println(games)  
        }  
    }  

//You can iterate set elements either by using for loop or foreach loop. You can also filter elements during iteration. In this example have used for loop to iterate set elements.

import scala.collection.immutable._
object SetObject2 {
  def main(args: Array[String]) {
    var games = Set("Cricket", "Football", "Hocky", "Golf")
    println(games)

    for (a <- games) {
      println(a)
    }
    println("+++++++++++++++++++++++++++++++++++++++++++++++++++")
    games.foreach((as: String) => println(as))
  }
}

// you can also use typical math operations like: intersection and union. 

import scala.collection.immutable._  
object SetObject3{  
    def main(args:Array[String]){  
        var games = Set("Cricket","Football","Hocky","Golf","C")  
        var alphabet = Set("A","B","C","D","E","Golf")  
        var setIntersection = games.intersect(alphabet)  
        println("Intersection by using intersect method: "+setIntersection)  
        println("Intersection by using & operator: "+(games & alphabet))  
        var setUnion = games.union(alphabet)  
        println(setUnion)  
    }  
}  

//Scala SortedSet

import scala.collection.immutable.SortedSet              
object SetObject4{  
    def main(args:Array[String]){  
        var numbers: SortedSet[Int] = SortedSet(5,8,1,2,9,6,4,7,2)  
        numbers.foreach((element:Int)=> println(element))  
    }     
}  

//Scala HashSet
//HashSet is a sealed class. It extends AbstractSet and immutable Set trait. It uses hash code to store elements.
//It neither maintains insertion order nor sorts the elements.

import scala.collection.immutable.HashSet  
object SetObject5{  
    def main(args:Array[String]){  
        var hashset = HashSet(4,2,8,0,6,3,45)  
        hashset.foreach((element:Int) => println(element+" "))     
   }  
}  

//Scala BitSet
//Bitsets are sets of non-negative integers which are represented as variable-size arrays of bits packed into 64-bit words. The memory footprint of a bitset is determined by the largest number stored in it. It extends Set trait.

import scala.collection.immutable._  
object SetObject6{  
    def main(args:Array[String]){  
        var numbers = BitSet(1,5,8,6,9,0)  
        numbers.foreach((element:Int) => println(element))  
    }  
}

//You can perform basic operations like adding and deleting in the bitset. In the following example, we have applied these operations.

import scala.collection.immutable._  
object SetObject7{  
    def main(args:Array[String]){  
        var numbers = BitSet(1,5,8,6,9,0)  
        numbers.foreach((element:Int) => print(element+" "))  
        numbers += 20               // Adding an element  
        print("\nAfter adding 20: ")  
        numbers.foreach((element:Int) => print(element+" "))  
        numbers-=0              // Deleting an element  
        print("\nAfter deleting 0: ")  
        numbers.foreach((element:Int) => print(element+" "))  
    }  
}  

//Scala  ListSet
//ListSet class implements immutable sets using a list-based data structure. It maintains insertion order.

import scala.collection.immutable._  
object SetObject8{  
    def main(args:Array[String]){  
        var listset = ListSet(4,2,8,0,6,3,45)  
        listset.foreach((element:Int) => println(element+" "))  
    }  
}

//You can create empty ListSet either by calling the constructor or by applying the function ListSet.empty.

import scala.collection.immutable._  
object SetObject9{  
    def main(args:Array[String]){  
        var listset:ListSet[String] = new ListSet()                 // Creating empty ListSet by using constructor  
        var listset2:ListSet[String] = ListSet.empty                // Creating an empty listset  
        println("listset: "+listset)  
        println("listset2: "+listset2)  
        println("After adding new elements:")  
        listset+="India"            // Adding new element  
        listset2+="Russia"          // Adding new element  
        println("listset: "+listset)  
        println("listset2: "+listset2)  
    }  
}  
