package ProgrammingIQ;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        List<Integer> ll = new ArrayList<>();
        ll.add(20);
        ll.add(30);
        ll.add(45);
        ll.add(50);

        List<Integer> newList = new ArrayList<>();
        ll.stream().forEach(l -> newList.add(l));

        // ll.stream().filter(l->l%2==0).collect(Collectors.toList());

        // System.out.println(ll);
        // ll.removeIf(l -> l==20 || l==30);
        
         System.out.println(newList);
        
    }


    
}