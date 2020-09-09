package collectionsPractice.Java8.FunctionalInteraceEX;

import java.util.function.*;

import java.util.Map;
import java.util.LinkedHashMap;

public class Java8Features {

  
    public void squareIt(int num){
        System.out.println("Using 1.7 way of squaring "+num * num);
    }
     public void m1(){
         System.out.println("this is 1.7 style");
     }

    public static void main(String[] args) {
          //Normal way of doing Square 
        new Java8Features().squareIt(2);
        //Java8 way of doing
        Function<Integer,Integer> squareIt= i->i*i;
        System.out.println("1.8 way of squaring using function functional interface: "+squareIt.apply(2));

        Predicate<Integer> p = i->i%2==0;
        System.out.println(p.test(3));

        //converting above method m1 into lamda expressions
        //remove methodname,return type,access modifiers and add lamda symbol
        //() -> System.out.println("this is 1.8 lamda expressions style");
        // (int a , int b) -> System.out.println(a+b);
        //when compiler can understand the return type then need not mention the datatype
        //(a ,b) -> System.out.println(a+b);
        //when curley braces are not used then we no need to use return keyword explicitly
       // (a) -> a*a or (a) -> {return a*a} 
       //(s) -> s.lenght(); -> if only one parameter is there no need to use braces as well s -> s.length();


       Map<Integer,Integer> map1 = new LinkedHashMap<>();
       map1.put(1, 1);
       map1.put(2, 2);
       map1.put(1,1);

       System.out.println(map1);


    }

}