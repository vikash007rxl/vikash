//used to refer current object.

//You can call instance variables, methods, constructors by using this keyword.

//must be first statement in the constructor

//can define auxillary cons using def and this keyword

// in case of auxillary constructor declaration of variable are mendatory but in case of primary constructor its not
  // hence primary constructor is prefereable

class ThisExample{
    var id:Int = 0
    var name: String = ""
    def this(id:Int, name:String){  //
        this()  
        this.id = id  
        this.name = name  
    }  
    def show(){  
        println(id+" "+name)  
    }  
}  
  
object MainOb{  
    def main(args:Array[String]){  
        var t = new ThisExample(101,"Martin")  
        t.show()  
    }  
}  

