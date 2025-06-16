public class Array01 {
  public static void main(String[] args){
    int[][] arr = new int[3][2]; // 2D array with 3 rows and 2 columns
    int nums[][] = new int[3][4]; // Another way to declare a 2D array with 3 rows and 4 columns.
    int count = 1;

    for(int i = 0; i < nums.length; i++){
      for(int j = 0; j < nums[i].length; j++){
        nums[i][j] = count; // Assigning values to the 2D array
        System.out.print(nums[i][j] + " "); // Printing the values in the array
        count++; // Incrementing the count for the next value
      }
      System.out.println(); // Print a new line after each row
    }
  }
}
