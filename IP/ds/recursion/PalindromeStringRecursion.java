package ds.recursion;

public class PalindromeStringRecursion {
    static String dest = "";
    public static void main(String[] args) {

        new PalindromeStringRecursion().palindromeStringRecursion("malayalam");
        
        
    }
    
    public void palindromeStringRecursion(String giveString){
            if(giveString.length() ==0) return;
            palindromeStringRecursion(""+giveString.charAt(giveString.length()-giveString.length()-1));

    }

}