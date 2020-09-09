package ProgrammingIQ;


import java.util.Map;
import java.util.TreeMap;

public class SuperReducedString {

    static String superReducedString(String s) {

        // String result ="";
        // for(int i=0;i<s.length()-1;i++){
        //     if(s.charAt(i) != s.charAt(i+1)){
        //         result+=s.charAt(i);
        //     }
        //     else{
        //         i= i+1;
        //     }
        // }
        // if(result.length() ==0){
        //     result ="Empty String";
        // }else if(s.length()%2!=0){
        //     result+=s.charAt(s.length()-1);
        // }

        Map<Character, Integer> map = new TreeMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.remove(s.charAt(i));
            }else{
                map.put(s.charAt(i),i);
            }
        }
        String result ="";
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result+=entry.getKey();
        }
        if(result.length()==0){
            result = "Empty String";
        }

        return result;
    }


    public static void main(String[] args) {

        String result = superReducedString("gfqqiwjdllsutxlpskxlrgmnunpobgvuimnudvtisdilhzaafarzlyjypvdcsvbpxdtsslszevkiclshpzbeuegxdnofgpuneduo");
        System.out.println(result);
        
    }
    
}