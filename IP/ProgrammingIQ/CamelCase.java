package ProgrammingIQ;

public class CamelCase {

    static int camelcase(String s) {
        int result=1;

        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))){
                result+=1;
            }
        }

        return result;

    }

    public static void main(String[] args) {
        
    }
    
}