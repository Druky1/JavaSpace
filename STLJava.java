/*
 * Collection API is a framework that provides classes and interfaces for storing and manipulating groups of objects.
 * Collection Interfaces include List, Set, Map, and Queue.
 * Collection Classes include ArrayList, LinkedList, HashSet, TreeSet, HashMap, TreeMap, PriorityQueue, etc.
 * These classes and interfaces provide various methods for adding, removing, and accessing elements in a collection.
 * The Collection API is part of the Java Standard Library and is included in the java.util package
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;


public class STLJava {
  public static void main(String[] args) {
    // Example of using ArrayList from the Collection API
    // List in Java is an interface that extends Collection and provides methods for manipulating a sequence of elements. Here, ArrayList is a class that implements the List interface, hence it makes the methods of the List interface available for use with defined methods.
    // ArrayList is a resizable array implementation of the List interface. It allows for dynamic arrays that can grow as needed.
    List<String> stringList = new ArrayList<String>(); 
    List<Integer> integerList = new ArrayList<Integer>();
    stringList.add("Hello");
    stringList.add("World");
    stringList.add("Java");

    integerList.add(1);
    integerList.add(2);
    integerList.indexOf(1); // Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.
    
    // Print the elements of the list
    for (String str : stringList) {
      System.out.println(str);
    }

    // Print the elements of the integer list
    for (Integer num : integerList) {
      System.out.println(num);
    }
    
    
  }

}
