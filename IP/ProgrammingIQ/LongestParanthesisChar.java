
/*
There is a string below, find the string and count of characters within the longest parentheses encompassing the string. As you can see below  {{(abc[chab}ab)]de}
is the largest parentheses.
Str = {{(abc[chab}ab)]de}[ab{c(dfg})]
*/
package ProgrammingIQ;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.HashMap;

public class LongestParanthesisChar {
    static Map<Character,StringBuilder> map = new LinkedHashMap<>();
    static  Map<Integer,String> finalString = new HashMap<>();
   

    public static void main(String[] args) {
        String s = "{{(abc[chab}ab)]de}[ab{c(dfg})]";

       if(!isBalancedString(s)){
            System.out.println("It's not balanced string");
            return;
       }else{
           System.out.println("Map with key and values "+map);
            StringBuilder openBracesIndexs = map.get('{');
            StringBuilder closeBracesIndexs = map.get('}');
           String[] openBracesIndexsArray = openBracesIndexs.toString().split(" ");
           String[] closeBracesIndexsArray = closeBracesIndexs.toString().split(" ");
           for(int i=0;i<openBracesIndexsArray.length;i++){
               for(int j=i;j<closeBracesIndexsArray.length;j++){
                   findAlphabetsInTheGivenRange(s, Integer.parseInt(openBracesIndexsArray[i]), Integer.parseInt(closeBracesIndexsArray[j]));
               }    
           }
           System.out.println("All enclosed strings "+finalString);
            Integer max =0;
           for(Map.Entry<Integer,String> maxAlphabets:finalString.entrySet()){
                if(max < maxAlphabets.getKey()){
                    max = maxAlphabets.getKey();
                }
           }
           System.out.println();
           System.out.println("The maximum string bw the parathesis "+finalString.get(max)+"  The count of the characters "+max);
       }

    }

    public static boolean isBalancedString(String s){
        int openParanthesisCount = 0;
        int closeParanthesisCount = 0;
        for(int i=0;i<s.length();i++){
            if('{' == s.charAt(i)){
                openParanthesisCount+=1;
               updateMap(s.charAt(i), i);
            }else if('}' == s.charAt(i)){
                closeParanthesisCount +=1;
                updateMap(s.charAt(i), i); 

            }else{
                continue;
            }
        }
        if(openParanthesisCount == closeParanthesisCount){
            return true;
        }


        return false;

    }

    public static void updateMap(Character c,int i){
        if(map.containsKey(c)){
            map.put(c, map.get(c).append(i+" "));
       }else{
           map.put(c, new StringBuilder(i+" "));
       }

    }

    public static Map<Integer,String> findAlphabetsInTheGivenRange(String s,int startIndex, int endIndex){
        // StringBuilder eachRangeString = new StringBuilder();
        // int count = 0;
        // for(int i=startIndex;i<=endIndex;i++){
        //     int asciiValue = s.charAt(i);
        //     if(((asciiValue>=65 && asciiValue<=90) || (asciiValue>=97 && asciiValue<=122))){
        //         count+=1;
        //         eachRangeString.append(s.charAt(i));
        //     }
        // }
        finalString.put(endIndex - startIndex, s.substring(startIndex, endIndex+1));

        return finalString;
    }

    
}