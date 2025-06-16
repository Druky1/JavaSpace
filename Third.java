import java.util.Map;
import java.util.HashMap;

public class Third {
  public static void main(String[] args){

    Map<String, Integer> marks = new HashMap<>();
    marks.put("A", 100);
    marks.put("B", 70);
    marks.put("C", 90);

    for(Map.Entry<String, Integer> entry : marks.entrySet()){ // For each entry in the entrySet (set) of key-value pairs
      System.out.println(entry.getKey());
      System.out.println(entry.getValue());
    }
  }
}
