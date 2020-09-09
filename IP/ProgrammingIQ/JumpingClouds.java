package ProgrammingIQ;

import java.util.Map;
import java.util.HashMap;

public class JumpingClouds {

    static int jumpingOnClouds(int[] c) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(c[i]==0){
                if(map.containsKey(c[i])){
                    map.put(c[i],map.get(c[i])+1);
                }
                else{
                    map.put(c[i],1);
                }
            }
        }
            int totalZeros = map.get(0);
            int result =0;
            if(c.length%2!=0 && totalZeros%2!=0){
                result = (totalZeros/2) +1;
            }else if(c.length%2==0 && totalZeros%2!=0){
                result = (totalZeros/2) +1;
            }else{
                result = (totalZeros/2);
            }
            return result;
    }
    
}