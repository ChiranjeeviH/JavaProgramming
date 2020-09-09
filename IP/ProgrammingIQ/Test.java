package ProgrammingIQ;


interface BaseI{
    void method();
}
class BaseC{
    public void method(){
        System.out.println("It's Base");
    }
}

public class Test extends BaseC implements BaseI{

    static int jumpingOnClouds(int[] c) {
        int count =0;
        for(int i=0;i<c.length;i++){
            if(i+2<c.length && c[i+2]==0){
                count+=1;
                i+=1;                                      
            }else{
                count+=1;
                if(i+1 >= c.length-1){
                    break;
                }
            }
        }
        return count;
            
    }

    public static void main(String[] args) {
        Float f1 = new Float("3.0");
        int x = f1.intValue();
        byte b = f1.byteValue();
        double d= f1.doubleValue();
       // System.out.println(x+b+d);
       //System.out.println(jumpingOnClouds(new int[]{0,0,0,1,0,0}));

       int a = 3 - (-1);
       //System.out.println("the value of a is "+a);

       String s = "asa";
       String reverse="";
       for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
       }
       System.out.println(reverse);
       if(reverse == s){
           System.out.println("its palindrome");
       }

    }
    
}