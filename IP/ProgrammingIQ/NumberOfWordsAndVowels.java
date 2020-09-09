package ProgrammingIQ;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class NumberOfWordsAndVowels {

    static int[] findNumberOfWordsAndVowels(int n, String s){

        int[] result = new int[2];
        Map<Character, Integer> map = new HashMap<>();
        

        int i=0,vowels=0,words=1;

        while(i<n){
            if(s.charAt(i) ==' '){
                words+=1;
            }
            if(Arrays.asList('a','e','i','o','u').contains(Character.toLowerCase(s.charAt(i)))){
                if(!map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), 1);
                    vowels+=1;
                }else{
                    map.put(s.charAt(i), map.get(s.charAt(i))+1);
                }
                
            }
            i++;

        }
        result[0] = vowels;
        result[1] = words;

        return result;


    }

    public static void main(String[] args) {

        int[] result = findNumberOfWordsAndVowels(12, "How Are You");
        System.out.println("Vowels in the given string is "+result[0]);
        System.out.println("Words in the given string is "+result[1]);
        
    }
    
}