//An extractor in Scala is an object that has a method called unapply as one of its members. The purpose of that unapply method is to match a value and take it apart. Often, the extractor object also defines a dual method apply for building values, but this is not required.

//The unapply method is what turns Test class into an extractor and it reverses the construction process of apply. Where apply takes two strings and forms an email address string out of them, unapply takes an email address and returns potentially two strings: the user and the domain of the address.

object Extractors {
   def main(args: Array[String]) {
      println ("Apply method : " + apply("Zara", "gmail.com"));
      println ("Unapply method : " + unapply("Zara@gmail.com"));
      println ("Unapply method : " + unapply("Zara Ali"));
   }
   
   // The injection method (optional)
   def apply(user: String, domain: String) = {
      user +"@"+ domain
   }

   // The extraction method (mandatory)
   def unapply(str: String): Option[(String, String)] = {
      val parts = str split "@"
      
      if (parts.length == 2){
         Some(parts(0), parts(1)) 
      } else {
         None
      }
   }
}

//Pattern Matching with Extractors

//When an instance of a class is followed by parentheses with a list of zero or more parameters, the compiler invokes the apply method on that instance. We can define apply both in objects and in classes.

//As mentioned above, the purpose of the unapply method is to extract a specific value we are looking for. It does the opposite operation apply does. When comparing an extractor object using the match statement the unapply method will be automatically executed.

object Extractors1 {
   def main(args: Array[String]) {
      val x = Extractors1(5)
      println(x)

      x match {
         case Extractors1(num) => println(x+" is bigger two times than "+num)
         
         //unapply is invoked
         case _ => println("i cannot calculate")
      }
   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}