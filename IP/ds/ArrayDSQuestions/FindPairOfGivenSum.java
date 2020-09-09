package ds.ArrayDSQuestions;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class FindPairOfGivenSum {

    public static void main(String[] args) {
        int[] arr = new int[]{8,7,2,5,3,1};
        //new FindPairOfGivenSum().findSumPairs(arr, 10);
        new FindPairOfGivenSum().findSumPairsUsingSort(arr, 10);
    }

    public void findSumPairs(int[] arr,int sum){

        Map<Integer,Integer> arrayMap= new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(arrayMap.containsKey(sum-arr[i])){
                System.out.println("Pair found "+arr[i]+ ","+(sum-arr[i]));
            }
            arrayMap.put(arr[i], i);
        }

    }

    public void findSumPairsUsingSort(int[] arr,int sum){
        Arrays.sort(arr);
        int min=0;
        int max=arr.length-1;
        while(min<max){
            if(arr[min]+arr[max]==sum){
                System.out.println("pair found"+arr[min]+","+arr[max]);
                min++;
                max--;
            }else if(arr[min]+arr[max]<sum){
                min++;
            }else{
                max--;
            }
        }
        
    }


    
}