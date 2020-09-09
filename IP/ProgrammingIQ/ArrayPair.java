package ProgrammingIQ;

import java.util.HashMap;
import java.util.Map;

public class ArrayPair {


    public void findArraypair(int number, int[] arr){
        Map<Integer,Integer> arrayPair = new HashMap<>();
        for(int i=0;i<number;i++){
            if(arrayPair.containsKey(arr[i])){
                //int value = (Integer) arrayPair.get(arr[i]);
                arrayPair.put(arr[i],arrayPair.get(arr[i])+1);
            }else{
                arrayPair.put(arr[i],1);
            }
        }

        int totalPairs = 0;
        for(Map.Entry<Integer,Integer> entry:arrayPair.entrySet()){
            //System.out.println("The entry key"+entry.getKey()+" is and values are"+entry.getValue());
            totalPairs+=entry.getValue()/2;
        }
        System.out.println(totalPairs);
    }

    public static void main(String[] args) {

        new ArrayPair().findArraypair(9, new int[]{10,20,20,10,10,30,50,10,20});
        
    }
    
}