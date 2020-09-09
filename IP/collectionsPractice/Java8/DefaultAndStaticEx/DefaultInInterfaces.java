package collectionsPractice.Java8.DefaultAndStaticEx;

interface I{
    public void m1();
    public void m2();
    default void m3(){
        System.out.println("Hey.. am default method and available from 1.8");
    }

    public static void m5(){
        System.out.println("This is static method");
    }
    //we can't create default methods of object class.
    // default String toString(){
    //     return null;
    // }
}

interface A{
    default void m4(){
        System.out.println("Default method in interface A");
    }
}

interface B{
    default void m4(){
        System.out.println("Default method in interface B");
    }
}
public class DefaultInInterfaces implements I,A,B{

    @Override
    public void m1() {
        System.out.println("this is implementation of m1 method");

    }

    @Override
    public void m2() {
        System.out.println("this is implementation of m2 method");

    }

    @Override
     public void m3(){
        System.out.println("am overridring default method");
    }

    @Override
     public void m4(){
        System.out.println("am overridring default method from those two interfaces");
        A.super.m4();
        B.super.m4();
    }

    public static void m6(){
        System.out.println("this is method of main class");
    }

    public static void main(String[] args) {
        
        new DefaultInInterfaces().m3();
        new DefaultInInterfaces().m4();
        I.m5();
        DefaultInInterfaces.m6();
    
    }
     

}