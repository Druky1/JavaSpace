// Annotations are special markers you put in your code to give instructions to the compiler or tools — without writing extra logic.


class A{
  public void display(){
    System.out.println("Display method in class A");
  }
}

class B extends A{
  @Override // This annotation indicates that the method is overriding a method from the superclass (A). So, it is not necessary but a good practice to use it. It will help catch errors if the method signature does not match the one in the superclass.
  // This method overrides the display method from class A.
  public void display(){
    System.out.println("Display method in class B");
  }
}


public class OverideJava {
  public static void main(String[] args){
    A a = new A();
    a.display(); // Calls the display method in class A

    B b = new B();
    b.display(); // Calls the display method in class B

    A ab = new B(); // Upcasting: B is treated as A
    ab.display(); // Calls the display method in class B due to dynamic method dispatch
  }
}
