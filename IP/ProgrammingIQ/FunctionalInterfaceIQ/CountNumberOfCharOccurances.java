package ProgrammingIQ.FunctionalInterfaceIQ;

import java.util.*;

public class CountNumberOfCharOccurances {

    public static void main(String[] args) {
        
        String s = "babacbd";
        Map<Character,Integer> mapResult = new TreeMap<>();
        
        for(int i=0;i<s.length();i++){

            if(!mapResult.containsKey(s.charAt(i))){
                mapResult.put(s.charAt(i),1);
            }else{
                mapResult.put(s.charAt(i), mapResult.get(s.charAt(i))+1);
            }
        }
        for(Map.Entry<Character,Integer> result:mapResult.entrySet()){
            System.out.print(result.getKey()+""+result.getValue());
        }
        System.out.println();
    }
    
}