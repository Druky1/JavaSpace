// Encapsulation in Java - This is a concept where the data (attributes) and methods (functions) that operate on the data are bundled together in a single unit, typically a class. It restricts direct access to some of an object's components, which can prevent the accidental modification of data.
class Human{
  private String name; // Restricting direct access to the name attribute
  private int age; // Restricting direct access to the age attribute

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) { 
    this.age = age;
  }

  // this keyword refers to the current object, allowing access to its attributes and methods.
  public void displayInfo() {
    System.out.println("Name: " + this.name + ", Age: " + this.age);
  }

  
}

public class Hello {
  public static void main(String[] args){
    Human human1 = new Human();
    human1.setName("Kookie");
    human1.setAge(25);
    System.out.println("Name: " + human1.getName()); // Accessing the name using the getter method
    System.out.println("Age: " + human1.getAge()); // Accessing the age using the getter method
    // human1.name = "Kookie"; // This line would cause an error because name is private and cannot be accessed directly.

    human1.displayInfo(); // Displaying the information using the displayInfo method
  }
}