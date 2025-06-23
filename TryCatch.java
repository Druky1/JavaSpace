public class TryCatch {
  public static void main(String[] args) {
    int i = 0;
    int j = 0;
    try {
      int result = 18/i; // This will throw an ArithmeticException if i is 0
      System.out.println("Result: " + result);
    } catch (Exception e) // Catching using the Exception class 
    {
      System.out.println("Exception caught: " + e.getMessage());
      // You can also handle specific exceptions like ArithmeticException
      if (e instanceof ArithmeticException) {
        System.out.println("Cannot divide by zero.");
      }
    } finally {
      System.out.println("Finally block executed.");
    }

    System.out.println("End of program execution.");
  }
}
