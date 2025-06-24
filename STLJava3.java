import java.util.HashMap;
import java.util.Map;

public class STLJava3 {
  public static void main(String[] args) {
    Map<String, Integer> students = new HashMap<String, Integer>();
    students.put("Alice", 100);
    students.put("Bob", 90);
    students.put("Charlie", 85);
    students.put("David", 95);
    students.put("Eve", 80);

    System.out.println(students); // Prints the entire set of key-value pairs

    // Accessing a value by key
    System.out.println("Score of Alice: " + students.get("Alice")); // Prints the score of Alice

    // In Map, the keys are unique, so if you try to add a duplicate key, it will overwrite the existing value.
    students.put("Alice", 95); // This will update Alice's score to 95
    // In Map, the values can be duplicated, so you can have multiple keys with the same value.
    students.put("Frank", 95); // This will add a new key "Frank"

    // Hence the keys are actually a set and the values are kind of a list.
    System.out.println(students.keySet()); // Prints the set of keys
    System.out.println(students.values()); // Prints the collection of values

    for(String key : students.keySet()){
      System.out.println(key + ": " + students.get(key)); // Prints each key-value pair
    }


    // for(Map.Entry<String, Integer> entry : students.entrySet()){
    //   String name = entry.getKey();
    //   Integer score = entry.getValue();
    //   System.out.println(name + ": " + score);
    // }

  }
}
