import java.util.*;

public class HashMap01 {

  // map.keySet() - Gets the key set from the key value pairs in the map.
  // map.containsKey() - Checks if the element is present in the map.
  // map.put() - Attach the key and the value pair in the map.

  public static void majorityElement(int nums[]){
    HashMap<Integer, Integer> map = new HashMap<>();
    for(int i = 0; i < nums.length; i++){
      if(map.containsKey(nums[i])){

        map.put(nums[i], map.get(nums[i]) + 1);
      }
      else{
        map.put(nums[i], 1);
      }
    }
    for(int key : map.keySet()){
      if(map.get(key) > nums.length/3){
        System.out.println(key);
      }
    }
  }
  public static void main(String[] arg){
    int nums[] = {1,2,1,2,3};
    majorityElement(nums);
  }
}
