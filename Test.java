public class Test {
  public static void main(String[] args){
    String sentence = "Hello World";
    String[] words = sentence.split(" ");
    for(String word : words){
      System.out.println(word + ",");
    }
  }
}
