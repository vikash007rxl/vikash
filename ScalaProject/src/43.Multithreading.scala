//Scala does not provide any separate library for creating thread. If you are familiar with multithreading concept of Java, you will come to know that it is similar except the syntax of Scala language itself.

//1) New
//This is the first state of thread. It is just before starting of new thread.
//
//2) Runnable
//This is the state when thread has been started but the thread scheduler has not selected it to be the running thread.
//
//3) Running
//The thread is in running state if the thread scheduler has selected it.
//
//4) Non-Runnable (Blocked)
//This is the state when the thread is still alive, but is currently not eligible to run due to waiting for input or resources.
//
//5) Terminated
//A thread is in terminated or dead state when its run() method exits.