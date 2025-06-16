import java.util.List;
import java.util.ArrayList;

public class Sec {
  
  // Integer is a wrapper class (contains many methods) which takes up the primitive dtype "int" and turns it into object to be used by other classes.
  // ArrayList is an implementation of List interface (a generic template defined) which contains ordered collection of objects containing duplicates.
  // Objects get stored in Heap.
  public static void main(String[] args){

    List<Integer> arr = new ArrayList<>(); // ArrayList of Integer objects
    arr.add(1); 
    arr.add(2);
    arr.add(3);
    arr.add(4);
    arr.add(5);

    for(int i = 0; i < arr.size(); i++){
      System.out.println(arr.get(i));
    }

    int[] arr1 = {1,2,3,4,5}; // Normal implementation without objects, gets stored in stack instead of heap.
    for(int i = 0; i < arr1.length; i++){
      System.out.print(arr1[i]);
    }
  }
}
