import java.util.ArrayList;
public class ArrayList01 {
  public static void main(String[] args){
    ArrayList<Integer> nums = new ArrayList<Integer>();

    // Adding Elements
    nums.add(1);
    nums.add(2);
    nums.add(3);

    System.out.println(nums);


    // Get elements
    int element = nums.get(0);
    System.out.println(element);

    // Add ele in between
    nums.add(0, 10);
    nums.add(1, 20);
    System.out.println(nums);

    // Set element
    nums.set(2, 30);
    System.out.println(nums);

    // Delete element
    nums.remove(0);
    System.out.println(nums);

    
    
  }
}
