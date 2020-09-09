package ProgrammingIQ;

public class AddElementsFromTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {};
        int[] arr2 = {4,67,2,8};
        int[] finalArray = new int[arr1.length+arr2.length*2];
        int[] temp;
        if(arr1.length>arr2.length){
            temp = new int[arr1.length];
            for(int i=0;i<arr2.length;i++){
                temp[i]=arr2[i];
            }
            arr2 = temp;
        }else{
            temp = new int[arr2.length];
            for(int i=0;i<arr1.length;i++){
                temp[i]=arr1[i];
            }
            arr1 = temp;
        }
        int i=0,j=0,k=0;
        int len = arr1.length;
        while(len !=0){
            int sum=arr1[i]+arr2[j];
            if(sum>9){
                int rem = sum%10;
                int quot = sum/10;
                finalArray[k++] = quot;
                finalArray[k++]=rem;
            }else{
                finalArray[k++]=sum;
            }
            i++;j++;
           len = len-1;
        }
        for(int m=0;m<k;m++){
            System.out.print(" "+finalArray[m]);
        }
    }
    
}