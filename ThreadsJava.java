/* Threads are a way to run multiple tasks concurrently in Java.
  * A thread is a lightweight process that can run independently.
 * RAM acts as a a shared memory space for all threads.
 * Each thread has its own stack, which is a memory space for local variables and method calls.
 * Multi-tasking is the ability to run multiple threads at the same time which allows PC to run multiple applications simultaneously.
  Multithreading is a feature of Java that allows concurrent execution of two or more threads.
 */
class A extends Thread{
  public void run(){
    for(int i = 0; i <= 10; i++){
      System.out.println("Hello " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        // This exception is thrown when a thread is interrupted while sleeping.
      }
    }
  }
}

class B extends Thread {
  public void run(){
    for(int i = 0 ; i <= 10; i++){
      System.out.println("Hi " + i);
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
        // This exception is thrown when a thread is interrupted while sleeping.
      };
    }
  }
}


public class ThreadsJava {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();
    obj1.start();
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    obj2.start();
    // The start() method is used to begin the execution of a thread.
  }
}
