package exceptionHandling;

public class ExceptionTest {

    public void StringManipulation(String s ) throws StringIndexOutOfBoundsException{

        System.out.println(s.charAt(8));

    }


    public static void main(String[] args) {


        try{


            System.out.println("The main method");

            Thread t = new Thread();
            t.start();
            t.join();

            new ExceptionTest().StringManipulation("chiru");
            new ExceptionTest().wait();

            return;

            //System.out.println("it won't print ");

        }
        catch(StringIndexOutOfBoundsException e1){
            System.out.println("Its caught here"+e1.getMessage());
        }
        catch(Exception e){

            System.out.println("Error occured "+e.getMessage());
            return;

        }
        finally{
            System.out.println("Finally Mehtod calls always");
        }
        

    }
    
}