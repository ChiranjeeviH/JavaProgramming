package ProgrammingIQ;


public class ValidString {

    static boolean isStringValid(String s){

        int i=0,n = s.length();

        while(i<n){
            int asciiValue = (int) s.charAt(i);
            if(!((asciiValue>=65 && asciiValue<=90) || (asciiValue>=97 && asciiValue<=122))){
                return false;
            }
            i++;
        }
        return true;


    }

    public static void main(String[] args) {
        boolean result = isStringValid("Chiru$");
        System.out.println(result);
        
    }
    
}