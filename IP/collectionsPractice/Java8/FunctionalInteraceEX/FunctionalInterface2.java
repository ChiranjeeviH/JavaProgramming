package collectionsPractice.Java8.FunctionalInteraceEX;

@FunctionalInterface
public interface FunctionalInterface2 {

    //Valid since its overriding
    //public void m1();
    //Invalid since functional interface allows only one abstract method
    public void m1();

}