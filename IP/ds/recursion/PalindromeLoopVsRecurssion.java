package ds.recursion;
public class PalindromeLoopVsRecurssion{

    public static void main(String args[]){
        boolean flag = new PalindromeLoopVsRecurssion().findPalindromeLoop(191);    
        String result = flag?"It's palindrome":"Not a Palindrome";
        System.out.println(result);
        int flag1 = new PalindromeLoopVsRecurssion().findPalindromeResursively(19);  
        String result1="";  
         if(flag1==1){ result1= "It's palindrome";}else{result1="Not a Palindrome1";};
        System.out.println(result1);
    }

    private boolean findPalindromeLoop(int number){
        int temp = number;
        int reverse = 0;
        if(number<10){
            return false;
        }
        else{
             while(number>0){
                int remainder = number%10;
                reverse=reverse*10+remainder;
                number = number/10;
                }
        }
       return  temp==reverse?true:false;
    }

    
    private int findPalindromeResursively(int num){
        return num<=10?0:palindromeRecursive(num,num);

    }
    static int sum=0;
    
    private int palindromeRecursive(int num,int temp){
        
        int remainder=0;
        if(num>0){
            remainder = num%10;
            sum = sum*10+remainder;
            num=palindromeRecursive(num/10,temp);
        }
        if(temp==sum){
            return 1;
        }

        return 0;
    }
}