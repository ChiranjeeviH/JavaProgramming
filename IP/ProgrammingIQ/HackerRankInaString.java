package ProgrammingIQ;

import java.util.Map;
import java.util.TreeMap;

public class HackerRankInaString {


    static String hackerrankInString(String s) {
        String result = "";
        String matchString="HackerRank";
        int count=0;
        //Putting all characters in Map
        Map<Character,Integer> inputStringChars= new TreeMap<>();
        for(int i=0;i<s.length();i++){
            inputStringChars.put(s.charAt(i), i);
        }
        for(int i=0;i<matchString.length();i++){
            if(inputStringChars.containsKey(matchString.charAt(i))){
                result+=matchString.charAt(i);
                count+=1;
            }
        }
       if(count!=matchString.length()){
           System.out.println("String not found");
       }
       else{
        //    for(int i=0;i<s.length();i++){
        //        if(s.charAt(i)==matchString.charAt(0)){
        //            //s= s.substring(i,s.length()-1);
        //            matchString=matchString.substring(1,matchString.length()-1);
        //            count+=1;
        //        }
        //    }
        System.out.println("the result string is: "+result);
        if(matchString.equalsIgnoreCase(result)){
            System.out.println("String Found");
        }
           
       }


        return result;

    }

    public static void main(String[] args) {

        hackerrankInString("hereiamstackerrank");
        
    }
    
}