public class Array03 {
 public static void main(String[] args){
  int nums[] = new int[5]; // Declare an array of integers with size 5
  nums[0] = 10; // Assign value 10 to the first element
  nums[1] = 20; // Assign value 20 to the second element 
  nums[2] = 30; // Assign value 30 to the third element
  nums[3] = 40; // Assign value 40 to the fourth element
  nums[4] = 50; // Assign value 50 to the fifth element

  for(int num: nums){ // Enhanced for loop to iterate through the array, only works with arrays and collections
    // For each element in the nums array, assign it to num
    System.out.println(num); // Print each element of the array
  }
 } 
}
