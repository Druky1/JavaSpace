
// Interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types. Interfaces cannot contain instance fields or constructors. The methods in interfaces are abstract by default, meaning they do not have a body and must be implemented by classes that choose to implement the interface.
// A class implements an interface by providing the body of the methods declared in the interface.


@FunctionalInterface // This annotation indicates that the interface is intended to be a functional interface, which means it has exactly one abstract method. It is not necessary but a good practice to use it.
interface A{ 
  void show(); // Here we can't define it because its public abstract by default. Abstract methods do not have a body.
}

// class B implements A { // Class B implements interface A
//   public void show() { // We must provide the body of the method here
//     System.out.println("Show method in class B");
//   }
// }

public class Inf {
  public static void main(String[] args) {
    A obj = new B()
    {
      @Override
      public void show() { // Providing the body of the method in an anonymous class
        System.out.println("Show method in class B");
      }
    };
    obj.show(); // Calls the show method in class B
  }
}
