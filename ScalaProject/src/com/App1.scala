package com

//The App trait can be used to quickly turn objects into executable programs. Here is an example:

//Here, object Main inherits the main method of App.

//args returns the current command line arguments as an array.

//'''''It should be noted that this trait is implemented using the [[DelayedInit]]
// *  functionality, which means that fields of the object will not have been initialized
// *  before the main method has been executed.'''''
// *
// *  It should also be noted that the `main` method should not be overridden:
// *  the whole class body becomes the “main method”.

object App1 extends App {
  
  println("Hi App")
  
  println(new Class1().i);
  
}

class Class1{
  
  var i=47;
  
  
}