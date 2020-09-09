package ProgrammingIQ;


public class StringReverse {

    public static void main(String[] args) {

        String s = new StringReverse().reverseString("chiru");
        String s1 = new StringReverse().reverseStringRecursively("malayala");
        if(s1.equalsIgnoreCase("malayalam")){
            System.out.println("it's palindrome");
        }else{
            System.out.println("it's not palindrome");
        }
        System.out.println(s1);
        
    }

    public String  reverseString(String s){
            String result = "";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }

        return result;
    }

    public String reverseStringFor(String s){
        String result = "";
        for(char c:s.toCharArray()){
            result+=c;
        }

        return result;
    }

    public String reverseStringRecursively(String s){
        if(null==s || s.isEmpty()){
            return s;
        }

        return s.charAt(s.length()-1) + reverseString(s.substring(0, s.length()-1));
    }

}