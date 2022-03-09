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
        
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i = 0 ; i < n1 ; i++){
            int key = a1[i];
            if(hm.containsKey(key) == false){
                hm.put(key , 1);
            }
            else{
                int val = hm.get(key) + 1;
                hm.put(key , val);
            }
        }
        
        for(int i = 0 ; i < n2 ; i++){
            int key = a2[i];
            
            if(hm.containsKey(key) == true){
                if(hm.get(key) > 0){
                    int val = hm.get(key) - 1;
                    hm.put(key , val);
                    System.out.println(key);
                }
            }
            
        }
    }

}