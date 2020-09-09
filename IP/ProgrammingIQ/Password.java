package ProgrammingIQ;

public class Password {

    static int minimumNumber(int n, String password) {
        // Return the minimum number of characters to make the password strong
        int result =1;

        if(n < 6){
            result = 6-n;
        }

        return result;

    }

    public static void main(String[] args) {
        
    }
    
}