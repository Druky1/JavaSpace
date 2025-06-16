
// Use Static Variables and Methods when you wish to share data or behavior across all instances of a class.
class Student {
  static String schoolName = "ABC High School"; // Static variable shared by all instances
  String name; // Instance variable unique to each instance
  int age; // Instance variable unique to each instance


  // This is a static method that can be called without creating an instance of the class.
  static void displaySchoolName() {
    System.out.println("School Name: " + schoolName);
  }
}

public class OOPs {
  // Static means the variable or method belongs to the class, not to instances of the class / not to any object.
  public static void main(String[] args){
    // Creating instances of the student class
    Student student1 = new Student();
    student1.name = "Alice";
    student1.age = 16;
    Student student2 = new Student();
    student2.name = "Bob";
    student2.age = 17;
    // Accessing static variable
    // NOTE : You don't need an object to access a static variable, it's shared across all the objects of the class.
    System.out.println("School Name: " + Student.schoolName); 
    // Accessing instance variables
    System.out.println("Student 1: " + student1.name + ", Age: " + student1.age);
    System.out.println("Student 2: " + student2.name + ", Age: " + student2.age);

    Student.displaySchoolName(); // Calling the static method to display the school name
  }
}
