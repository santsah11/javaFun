
import java.util.*;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");
        System.out.println(userMap);
        System.out.println(userMap.get("nninja@codingdojo.com")); 
         Set < String > keys = userMap.keySet();
         for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));    
        }
    }
}
