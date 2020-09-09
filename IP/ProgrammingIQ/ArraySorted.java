package ProgrammingIQ;

public class ArraySorted {

    static boolean isArraySorted(int[] inputArray){
        int size = inputArray.length;
        int i=0;
        while(i<size-1){
            //Finding the next number is greater than or less than to detect is is sorted or not
            if(inputArray[i]< inputArray[i+1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {

        boolean result = isArraySorted(new int[]{4,3,2,1});
        System.out.println("is array sorted "+result);
        
    }
    
}