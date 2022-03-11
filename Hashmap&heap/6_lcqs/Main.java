import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0 ; i < n ; i++){
            arr[i] = scn.nextInt();
        }
        
        HashMap<Integer , Boolean> hm = new HashMap<>();
        for(int val : arr){
            hm.put(val , true);
        }
        for(int val : arr){
            if(hm.containsKey(val - 1) == true)
                hm.put(val , false);
        }
        
        int msp = 0;
        int ml = 0;
        for(int val : arr){
            if(hm.get(val) == true){
                int tsp = val;
                int tl = 1;
                
                while(hm.containsKey(tsp + tl) == true){
                    tl++;
                }
                
                if(tl > ml){
                    msp = tsp;
                    ml = tl;
                }
            }
            
        }
        
        for(int i = 0 ; i < ml ; i++){
            System.out.println(msp + i);
        }
        
    }

}