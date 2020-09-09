package ds.recursion;
public class FactorialRecursive {
    public static void main(String args[]){
        FactorialRecursive rFactorical = new FactorialRecursive();
        int factorialForGivenNumber = rFactorical.findFactorialForN(6);
        System.out.println(factorialForGivenNumber);

    }
    /*
    Mathematically factorial of a given result into given number(n) multiply with (n-1) until it reaches 0

    zero is the termination condtion otherwise in leads to stack overflow exception, one of the painfull
    with recursion.
    */
    private int findFactorialForN(int n){
        return n>0?n*findFactorialForN(n-1):1;
    }
}