package Top30IQ;

public class RemoveCharFromString {

    static String removeCharacter(String s, char charForRemoval){
        String result ="";
        for(char c:s.toCharArray()){
            if(c != charForRemoval){
                result+=c;
            }
        }
        if(s.length() == result.length()){
            result = "No character to remove " + s;
        }

        return result;
    }

    static String removeCharacterRecursively(String s,char c){

        return null;
    }

    public static void main(String[] args) {

       String s = removeCharacter("chiru", 'z');
       System.out.println(s);
        
    }
    
}