
package ds.recursion;
public class SumOfAllNaturalNumbersRecursive {

    public static void main(String args[]){
        int sum = new SumOfAllNaturalNumbersRecursive().findAllNaturalNumbersUsingRecursion(10);
        System.out.println(sum);

        int sum1 = new SumOfAllNaturalNumbersRecursive().findAllNaturalNumbersUsingFormula(10);
        System.out.println(sum1);
    }

    /*
        mathematically sum of all naturals results summation of numbers from 1 to given numer

        ex:- given numer is 6 then result is 1+2+3+4+5+6 = 21 
        we can formulate the expression to n(n+1)/2;
    */
    private int findAllNaturalNumbersUsingRecursion(int n){

        return n>0?n+findAllNaturalNumbersUsingRecursion(n-1):0;
    }

    private int findAllNaturalNumbersUsingFormula(int n){

        return n*(n+1)/2;
    }

}