// Stream API - It is used to process sequences of elements (like collections) in a functional style. It allows for operations like filtering, mapping, and reducing on collections of objects.
// It is part of the java.util.stream package and was introduced in Java 8.
// It provides a high-level abstraction for processing sequences of elements, allowing for parallel processing and lazy evaluation without using explicit loops like for, while or do-while.

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class STLJava5 {
  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    // Think of this as a pipeline of operations that can be performed on a collection of objects.
    // Create a stream from the list of numbers to perform operations upon it. 
    nums.stream()
        .filter(n -> n % 2 == 0) // Filter even numbers
        .map(n -> n * n) // Square the even numbers
        .forEach(n -> System.out.println(n)); // Print each squared number

  }
}
