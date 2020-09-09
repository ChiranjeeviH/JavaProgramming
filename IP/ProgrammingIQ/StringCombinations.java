package ProgrammingIQ;

import java.util.Arrays;

public class StringCombinations {

    public static void main(String[] args) {
       int[] arr = {1,2,7,8,9};
       int rotations = 3;
       int[] temp = new StringCombinations().createTempArrayWithRotation(arr, 3);
       System.out.println(Arrays.toString(temp));
       for(int j=0,i=rotations-1;i<arr.length;i++,j++){
            arr[i] = arr[j];
       }
       System.out.println(Arrays.toString(arr));




    }
    public int[] createTempArrayWithRotation(int[] arr,int rotations){
        int[] temp = new int[rotations];
        for(int i=0;i<rotations;i++){
            temp[i]=arr[i];
        }
        return temp;
    }
    
}