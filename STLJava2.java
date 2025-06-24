import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class STLJava2 {
  public static void main(String[] args) {
    Set<Integer> integerSet = new HashSet<Integer>(); // HashSet is a collection that contains no duplicate elements. It is implemented as a hash table, which allows for fast access to elements based on their hash code.
    integerSet.add(1);
    integerSet.add(1);
    integerSet.add(1);
    integerSet.add(2);
    integerSet.add(3);
    integerSet.add(3);
    integerSet.add(3);
    integerSet.add(5);

    // Iterator object
    Iterator<Integer> iterator = integerSet.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

    

    for(Integer num : integerSet) {
      System.out.println(num);
    }
  }
}
