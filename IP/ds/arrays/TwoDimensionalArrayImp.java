package ds.arrays;

public class TwoDimensionalArrayImp {
    public static void main(String[] args) {
        //creating a Two dimensional array
        int[][] arr = null;
        //Array instantiating with values
        int[][] array = {{1,2,3},{4,5,6}};
        //Adding an elements to array
        new TwoDimensionalArrayImp().insertElements(array, arr);
        //Display the elements in an array
        new TwoDimensionalArrayImp().displayAnArray(array);

        //Accessing the element randomly
        new TwoDimensionalArrayImp().accessingArrayLocation(array, 1, 2);

        //Delete the element at particualr location
        new TwoDimensionalArrayImp().deletingTheElementFromLocation(array, 0, 1);

        //search the element in an array
        new TwoDimensionalArrayImp().searchAnArray(array, 4);
    }

    private void insertElements(int[][] array,int[][] arr){
        //instantiating an array
        arr = new int[2][3];
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                arr[i][j] = array[i][j];
            }
        }
    }

    private void displayAnArray(int[][] array){
        System.out.println("The elements in the array");
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                System.out.print(array[i][j]+"    ");
            }
            System.out.println(" ");
        }
    }

    private void accessingArrayLocation(int[][] array,int row,int column){
        try{
            System.out.println("accessing the particualr element at the location arr["+row+"]"+"["+column+"]: "+array[row][column]);
            System.out.println(" ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index doesn't exist");
        }
    }

    private void deletingTheElementFromLocation(int[][] array,int row, int column){
        try{
            System.out.println("the element in the particualr location to delete: "+array[row][column]);
            System.out.println(" ");
            array[row][column] = Integer.MIN_VALUE;
            System.out.println("After deleting the element in the particular location the value is :"+array[row][column]);
            System.out.println(" ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index doesn't exist");
        }
    }

    private void searchAnArray(int[][] array,int value){
        try{
            for(int i=0;i<array.length;i++){
                for(int j=0;j<array[0].length;j++){
                    if(array[i][j]== value){
                        System.out.println("element found at the location: "+array[i][j]);
                        System.out.println(" ");
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index doesn't exist");
        }
        
    }
    
}

