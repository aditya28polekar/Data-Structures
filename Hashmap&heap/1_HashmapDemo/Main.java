import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args){
        HashMap<String , Integer> hm = new HashMap<>();
        
        // put -> adds to the map || updates the val if key already exist
        hm.put("india" , 10);
        hm.put("africa" , 20);
        hm.put("usa" , 30);
        hm.put("uk" , 40);
        
        System.out.println(hm);
        
        // get function - returns the value for a key
        System.out.println(hm.get("usa")); // 30
        System.out.println(hm.get("utopia"));// null
        
        
        // conatinsKey - return true if key exists else false
        System.out.println(hm.containsKey("usa")); // true
        
        // keySet -- to extarct all keys
        Set<String> keys = hm.keySet();
        for(String key : keys){
            System.out.println(key + "  ->  " + hm.get(key));
        }  
        
        
        
        
        
    }
}