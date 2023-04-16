import java.util.*;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String , Integer> map = new HashMap<>();
        map.put("China ", 130);
        map.put("India", 230);
        map.put("USA", 22);
      System.out.println(map);
      if(map.containsKey("India"))
      {
          System.out.println("Yes INDIA is present ");
      }
      else{
          System.out.println("NOT PRESENT");
      }
        System.out.println(map.get("brazil"));
        System.out.println(map.get("China"));
    
    for(Map.Entry<String , Integer> e : map.entrySet() ){
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    map.remove("USA");
    System.out.println(map);
}
}