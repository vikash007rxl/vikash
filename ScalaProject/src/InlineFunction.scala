
//Pending do google
object InlineFunction {
  def main(args: Array[String]): Unit = {
    println(new abc().d)
  }
}

class abc{
  
  val d=(name:String) => "ff"+name
}