package ProgrammingIQ;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {2,5,6,1,7};
        int ele = 1;
        System.out.println(new LinearSearch().linearSearch(arr, ele));
    }


public String linearSearch(int[] arr,int b){

    for(int i=0;i<arr.length;i++){
        if(arr[i]==b){
            return "Element Found";
        }
    }
    return "Element Not found";

}

}