
// Enum is a special Java type used to define collections of constants.// It is a type-safe way to define a fixed set of constants. // Enums can have fields, methods, and constructors. // They are implicitly final and cannot be extended.
enum Status {
  Success, Pending, Rejected, Failed
}

public class EnumJava {
  public static void main(String[] args){
    Status[] status = Status.values();
    for(Status s : status){
      System.out.println(s);
    }
  }
}
