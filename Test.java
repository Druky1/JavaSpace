public class Test {
  public static void main(String[] args){
    String sentence = "Hello World";
    String[] words = sentence.split(" ");
    String vowels = "aeiouAEIOU";
    System.out.println(vowels.indexOf());
    for(String word : words){
      System.out.println(word + ",");
    }
  }
}
