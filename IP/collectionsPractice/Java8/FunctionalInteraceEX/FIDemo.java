package collectionsPractice.Java8.FunctionalInteraceEX;


//@FunctionalInterface
interface FI{
    public void m1();
}

@FunctionalInterface
interface Add{
    public void add(int a, int b);
}

public class FIDemo {

    public static void main(String[] args) {
        FI fiParent = () -> System.out.println("Implementation of functional interface");
        fiParent.m1();

        Add add = (a,b) -> System.out.println(a+b);
        add.add(3, 4);

        //1.8 way for implemting runnable iterface ->Executing child therad
        Runnable r = () -> {
            for(int i=0;i<10;i++){
                System.out.println("Child Thread");
            }
        };
        //Executing main therad
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

        
    }


}