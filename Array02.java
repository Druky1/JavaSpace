class Student{
  String name;
  int age;
  int rollNo;
}

public class Array02 {
  public static void main(String[] args){
    Student stud1 = new Student();
    stud1.name = "Druky";
    stud1.age = 21;
    stud1.rollNo = 1;
    Student stud2 = new Student();
    stud2.name = "John";
    stud2.age = 22;
    stud2.rollNo = 2;
    Student stud3 = new Student();
    stud3.name = "Jane";
    stud3.age = 23;
    stud3.rollNo = 3;

    Student[] students = new Student[3]; // Array of Student objects.
    // Student[] is the type of the array, which means it can hold Student objects.
    // name of Array is students, it can hold 3 Student objects.
    students[0] = stud1;
    students[1] = stud2;
    students[2] = stud3;
    // for(int i = 0; i < students.length; i++){
    //   System.out.println("Name: " + students[i].name);
    //   System.out.println("Age: " + students[i].age);
    //   System.out.println("Roll No: " + students[i].rollNo);
    //   System.out.println(); // Print a new line for better readability
    // }
    for(Student stud: students)
    {
      System.out.println("Name: " + stud.name);
      System.out.println("Age: " + stud.age);
      System.out.println("Roll No: " + stud.rollNo);  
    }
  }
}

// This represents an array of Student objects inside them. 