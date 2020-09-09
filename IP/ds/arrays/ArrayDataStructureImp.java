package ds.arrays;

public class ArrayDataStructureImp {
    public static void main(String args[]){
        //one of of declaring and instatiating an arry
        int[] array = {1,2,3,4,5};
        int[] array1 = new int[5];
        //two dimensional array
        int[][] arrayTwo = {{1,2},{2,3}};
        int[][] arrayTwo1 = new int[5][5];

        //inserting into an array for one deimentionsal array
        for(int i=0;i<array.length;i++){ //inserting n elements into the array which of size n results O(n)
            array1[i] = array[i];// inserting at particular index is O(1) total complexity = O(n) * O(1) = O(n)
        }

        //inserting into an array for one deimentionsal array for two dimensonal
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                arrayTwo1[i][j] = arrayTwo1[i][j]; 
            }
        }

        //Traversing an array either to find an element or to print a value
        //One dimensional array
        for(int i=0;i<array1.length;i++){
            System.out.println("Printing the elements from singl dimensional array :"+array[i]);
        }
        //Two dimensional array
        for(int i=0;i<arrayTwo1.length;i++){
            for(int j=0;j<arrayTwo1.length;j++){
                System.out.println("Printing the elements from two dimensional array :"+arrayTwo1[i][j]);
            }
        }

        for(int i=0;i<arrayTwo.length;i++){
            for(int j=0;j<arrayTwo.length;j++){
                System.out.println(arrayTwo[i][j]);
            }
        }

        //Random accessing the value from an array
        System.out.println("Random accessing the element using index of 1 is: "+array[1]);

        //searching in array for an given element
        System.out.println("The element is found at the index: "+new ArrayDataStructureImp().findTheGivenElementInAnArray(3, array));

        //Deleting an element from an Array
        System.out.println(
        new ArrayDataStructureImp().deleteElementFromArrayPosition(3, array) +"the current value from the postion 3 is: " + 
        array[3]);


    }

    private int findTheGivenElementInAnArray(int num,int[] array){
        int result =0; //O(1)
        for(int i=0;i<array.length;i++){ //O(n)
            if(array[i] == num){//O(1)
                result=i; //O(1)
            }
        }
        //as only one two varibale been used the space complexity is O(2) // constants usually denote using O(1)

        return result;
    }

    private int deleteElementFromArrayPosition(int value,int[] array){
        int postion =0;
        if(array[value] > 0){
            array[value] = Integer.MIN_VALUE;
            System.out.println(Integer.max(20, 30));
            postion = value;
        }

        return postion;
    }
    
}