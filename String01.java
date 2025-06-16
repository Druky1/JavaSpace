public class String01 {
  public static void main(String[] args){
    String name = new String("Druky"); // Create a new String object which is stored in the heap memory
    // This is less memory efficient because it creates a new object in the heap.
    String name2 = "John"; // Create a String literal, which is more memory efficient is stored in the String pool. The String pool is a special memory area in the heap where Java stores String literals.
    // This is more memory efficient because it reuses the String object if it already exists in the String pool.

    System.out.println(name);
    System.out.println(name2);
    System.out.println(name.charAt(0)); // Access the first character of the string
    System.out.println(name.concat(" Doe")); // Concatenate another string to the original string

    String user = "Jane";
    String user2 = "Jane";
    System.out.println(user == user2); // This checks if both references point to the same object in memory, which they do because they are String literals.

    // By default, String objects are immutable in Java, meaning once created, their values cannot be changed.
    StringBuilder randomName = new StringBuilder("Druky ");
    randomName.append(user2); // StringBuilder is mutable, so we can change its value.
    System.out.println(randomName); // This will print the modified string, which is "Druky BoiJane"
  }
}
