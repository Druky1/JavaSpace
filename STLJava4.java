import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class STLJava4 {
  public static void main(String[] args) {
    List<Integer> nums = new ArrayList<>();
    nums.add(5);
    nums.add(3);
    nums.add(8);
    nums.add(1);
    nums.add(4);
    nums.add(2);

    Collections.sort(nums); // Sorts the list in ascending order
    System.out.println("Sorted List: " + nums);
  }
}
