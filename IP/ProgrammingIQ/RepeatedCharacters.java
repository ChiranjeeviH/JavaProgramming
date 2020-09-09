package ProgrammingIQ;

public class RepeatedCharacters {


    static long repeatedString(String s, long n) {
        int stringLength = s.length();
        String finalString = "";
        for(int i=0;i<stringLength;i++){
            if(null!=finalString && finalString.length()!=0 && finalString.length()==n){
                break;
            }
            else if(i == stringLength-1){
                finalString+=s.charAt(i);
                i=-1;
            }else {
                finalString+=s.charAt(i);
            }
        }
        int repeatCharacters = 0;
        for(int i=0;i<finalString.length();i++){
            if(finalString.charAt(i)=='a'){
                repeatCharacters+=1;
            }
        }
        return repeatCharacters;


    }

    public static void main(String[] args) {
        
    }
    
}