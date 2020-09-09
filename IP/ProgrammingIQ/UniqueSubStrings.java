package ProgrammingIQ;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueSubStrings {

    public static String[] uniqueStrings(String[] arrayStrings, int[] queries) {
        Set<String> uniqueStrings = new TreeSet<>();
        String[] result = new String[queries.length];
        for (String s : arrayStrings) {
            for (int i = 0; i <= s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    uniqueStrings.add(s.substring(i, j));
                }
            }
        }
            
        List<String> finalList = new ArrayList<>(uniqueStrings);
        try{
            for(int i=0;i<queries.length;i++){
                if(finalList.size() < queries[i]){
                    result[i] = "INVALID";
                }else{
                    result[i] = finalList.get(queries[i]-1);
                }
                
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.err.println("an Error occured");
        }

        return result;
    }

    public static void main(String[] args) {

        String[] result = uniqueStrings(new String[]{"aab","aac"},new int[]{3,8,8});
        for(String s:result){
            System.out.println(s);
        }

    }

}