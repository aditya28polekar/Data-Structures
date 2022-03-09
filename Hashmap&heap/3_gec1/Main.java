import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a1 = new int[n1];
        for(int i = 0 ; i < a1.length ; i++){
            a1[i] = scn.nextInt();
        }
        
        int n2 = scn.nextInt();
        int[] a2 = new int[n2];
        for(int i = 0 ; i < a2.length ; i++){
            a2[i] = scn.nextInt();
        }
        
        HashMap<Integer , Integer> hm1 = new HashMap<>();
        
        
        
        for(int i = 0 ; i < n1 ; i++){
            int key = a1[i];
            
            if(hm1.containsKey(key) == false){
                hm1.put(key , 1);
            }
            
        }
        
        for(int i = 0 ; i < n2 ; i++){
            int key = a2[i];
            
            if(hm1.containsKey(key)){
                hm1.remove(key);
                System.out.println(key);
            }
            
        }
        
        
    }

}