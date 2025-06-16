public class First{

  // public -> This method of the class can be accessed anywhere.
  // static -> no object is needed to call main(), this method belongs to the class itself, not an instance of the class.
  // void -> basically the return type, void here means it returns nothing.
  // main -> special method name (JVM looks for this entry point).
  // String[] -> Accepts command line arguments, basically an array of strings where args is the name of the array.
  // When you run the program through command line and pass some arguments, they will be stored in the args array (name your array whatever you want)
  public static void main(String[] args){
    // System.out.println(args[0]);
    
    int a = 21; // int is a primitive data type
    System.out.println(Integer.toString(a)); // Integer is a class also called wrapper contains a method called toString.

    String name = "Druky";
    System.out.println(name);

    for(int i = 0; i <= 10; i++){
      System.out.println(i);
    }
  }

}
