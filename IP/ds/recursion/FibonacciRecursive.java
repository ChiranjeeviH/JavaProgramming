package ds.recursion;
public class FibonacciRecursive{
    public static void main(String args[]){
        FibonacciRecursive fr = new FibonacciRecursive();
        Object fibN=fr.fibonacci(0);
        System.out.println(fibN);
    }

    /*
        Fibonacci number is a sum of two precedeing numbers
        and first two numbers in this sereis are reserved which 0 and 1
        Ex:- 0,1,1,2,3,5,8,13,21......
        first two numnbers in the series is alreday reserved which is 0 and 1 for fib(1) and fib(2),
        we can achieve by doing n-1 and rest we can achieve by summing up the two preceding numbers.
    */
    private Object fibonacci(int num){
        return num<1?"Invalid NUmber":num>2?(Integer)fibonacci(num-1)+(Integer)fibonacci(num-2):num-1;
    }

}