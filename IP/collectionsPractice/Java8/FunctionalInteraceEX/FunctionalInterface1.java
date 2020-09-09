package collectionsPractice.Java8.FunctionalInteraceEX;

@FunctionalInterface
public interface FunctionalInterface1 {

    public void m1();

    default void m8(){
        System.out.println("this is default method in functional interface");
    }

}