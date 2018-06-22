
//You can create, open, write and read file. Scala provides a complete package scala.io for file handling.

//Creating a File Example
//Scala doesn't provide file writing methods. So, you have to use the Java PrintWriter or FileWriter methods.
import java.io._
object FileWriter {

  def main(args: Array[String]): Unit = {
    val fileObject = new File("ScalaFile.txt") // Creating a file
    
    println (fileObject.exists())
  val printWriter = new PrintWriter(fileObject) // Passing reference of file to the printwriter
  printWriter.write("Hello, This is scala file") // Writing to the file
  printWriter.close()
  }
  

}

//Scala Reading File Example: Reading Each Charecter

import scala.io.Source  
  
object FileReader{  
  def main(args:Array[String]){  
    val filename = "ScalaFile.txt"  
    val fileSource = Source.fromFile(filename)  
    while(fileSource.hasNext){  
      print(fileSource.next)  
    }  
    fileSource.close()  
  }  
}  


object FileReader1{
  
  def main(args: Array[String]): Unit = {
    val filename = "ScalaFile.txt"  
    val file= Source.fromFile(filename)
    for(line <- file.getLines()){
      println (line)}
    
   //   file.foreach((abc: Any) => print(abc+" "))
  }
}

//Reading a Line from Command Line

object FileReader2 {
   def main(args: Array[String]) {
      print("Please enter your input : " )
//      val line = Console.readLine
      
//      println("Thanks, you just typed: " + line)
   }
}