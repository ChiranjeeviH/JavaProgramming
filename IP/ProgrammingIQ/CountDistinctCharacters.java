package ProgrammingIQ;

import java.util.Map;
import java.util.HashMap;


public class CountDistinctCharacters {

    public static void main(String[] args) {

        CountDistinctCharacters cd = new CountDistinctCharacters();
        int[][] range = {{0,6},{3,7}};
        int[] result = cd.getDistinctCharactersInStringRange("geekssforgeeks", range);
        for(int i=0;i<result.length;i++){
            System.out.println("the count for the each iteration is: "+result[i]);
        }

        
    }

    public int[] getDistinctCharactersInStringRange(String s , int[][] range){
        int i,j;
        int[] newArray = new int[5];
        int[] resultArray = new int[range.length];
        for(i=0;i<range.length;i++){
            for(j=0;j<range.length;j++){
                newArray[j] = range[i][j];
            }
            resultArray[i] = getDistinctCharacters(s,newArray);
        }


        return resultArray;
    }

    private int getDistinctCharacters(String s, int[] array){
        int distinctChar =0;
        try{
            //System.out.println("the range values are: "+array[0]+" "+array[1]);
            String rangeString = s.substring(array[0],array[1]);
            //System.out.println("the range string before pusing to map: "+rangeString);
            Map<Character, Integer> map = new HashMap<>();
            for(int i=0;i<rangeString.length();i++){
                map.put(rangeString.charAt(i), i);
            }
            distinctChar=map.size();
           
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println("Exception occured: "+e1);
        }
        catch(Exception e){
            System.out.println("other error occured "+e);
        }

        return distinctChar;
    }

}