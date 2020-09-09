package ProgrammingIQ;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1,5,2,6,7};
        int ele = 1;
       Arrays.sort(arr);
        BinarySearch b1 = new BinarySearch();
       int result =  b1.binarySearch(arr, ele);
       if(result == -1){
           System.out.println("Element not found");
       }else{
           System.out.println("element found at the index :"+result);
       }
    }

    public int binarySearch(int[] arr,int b){
        if(arr[arr.length/2] == b){
            return arr.length/2;
        }else if(b < arr[arr.length/2]){
            int[] temp = new int[arr.length/2];
            for(int j=0,i=0;i<arr.length/2;i++,j++){
                temp[j] = arr[i];
            }
            binarySearch(temp, b);
        }else{
            int[] temp = new int[arr.length/2];
            for(int j=0,i=(arr.length/2)+1;i<=arr.length;i++,j++){
                temp[j] = arr[i];
            }
           binarySearch(temp, b);
        }

        return -1;
    
    }
    
}