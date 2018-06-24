
//Extending Thread Class
class ThreadExample extends Thread {
  override def run() {
    println("Thread is running?");
  }
}
object ThreadObject {
  def main(args: Array[String]) {
    var t = new ThreadExample()
    t.start()
  }
}

//Extending Runnable Interface

class ThreadExample1 extends Runnable {
  override def run() {
    println("Thread is running...")
  }
}
object ThreadObject1 {
  def main(args: Array[String]) {
    var e = new ThreadExample1()
    var t = new Thread(e)
    t.start()
  }
}  