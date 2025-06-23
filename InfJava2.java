
@FunctionalInterface
interface A {
  int add(int a, int b);  // This is a functional interface with a single abstract method
}

public class InfJava2{
  public static void main(String[] args) {
    A obj = (a, b) -> { 
      return a + b;
    };
    // You can also use lambda expression directly
    // A obj = (a, b) -> a + b; // This is a more concise way to write the same thing
    
    int result = obj.add(5, 10);
    System.out.println("The sum is: " + result);  // Output: The sum is: 15
  }
}