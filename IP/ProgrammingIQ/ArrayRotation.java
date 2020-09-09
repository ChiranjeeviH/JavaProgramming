package ProgrammingIQ;

import java.util.Arrays;

public class ArrayRotation {

    static int[] rotLeft(int[] a, int d) {

        int size = a.length;
        int[] resultArray = new int[size];
        if (d > size) d = d % size;


        System.arraycopy(a, d, resultArray, 0, size-d);
        System.arraycopy(a, 0, resultArray, size-d, d);
        System.out.println(Arrays.toString(resultArray));


        return resultArray;


    }

    public static void main(String[] args) {

        rotLeft(new int[]{1,2,3,4,5}, 2);
        
    }
    
}