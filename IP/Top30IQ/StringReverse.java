package Top30IQ;

public class StringReverse {


    private boolean stringNullOrEmpty(String s){
        if(null == s || s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    private String reverseIterative(String s){

        if(stringNullOrEmpty(s)){
            return s;
        }

        String result ="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        return result;

    }

    private String reverseRecursilvely(String s){

        if(stringNullOrEmpty(s)){
            return s;
        }
        return s.charAt(s.length()-1)+reverseRecursilvely(s.substring(0, s.length()-1));

    }

    private String reverseInbuiltFunction(String s){

        StringBuilder sb = new StringBuilder(s);


        return sb.reverse().toString();

    }

    public static void main(String[] args) {

        StringReverse sr = new StringReverse();

        String strRevItr = sr.reverseIterative("chiru");

        String strRevRecr = sr.reverseRecursilvely("malayalam");

        String strRevInb = sr.reverseInbuiltFunction("ananya");

        System.out.println("strRevItr "+strRevItr+" strRevRecr "+strRevRecr+" strRevInb "+strRevInb);


        
    }
    
}


