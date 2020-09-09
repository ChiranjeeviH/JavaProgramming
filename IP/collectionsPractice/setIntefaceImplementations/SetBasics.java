package collectionsPractice.setIntefaceImplementations;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedList;

public class SetBasics {

    public static void main(String[] args) {

        // SortedSet<Integer> s2 = new TreeSet<>(Comparator.reverseOrder());
        // s2.add(2);
        // s2.add(1);
        // s2.add(3);
        // System.out.println(s2.toString());
        // List<String> s1= new ArrayList<>();
        // System.out.println(s1.add("chiru"));
        // System.out.println(s1.add("is"));
        // System.out.println( s1.add("a good boy"));
        // System.out.println(s1.add("chiru"));

        // System.out.println(new LinkedHashSet<>(s1).toString());

        CustomObject c = new CustomObject(1,"chiru");
        CustomObject c1 = new CustomObject(2,"venky");
        CustomObject c2 = new CustomObject(1,"chiru");

        Set<CustomObject> s1 = new TreeSet<>();
         System.out.println(s1.add(c));
         System.out.println( s1.add(c1));
         System.out.println(s1.add(c2));
         for(CustomObject cc1 : s1){
            // System.out.println(cc1.toString());
         }

         Map<CustomObject,String> m1 = new HashMap<>();
         m1.put(c, c.getName());
         m1.put(c1, c1.getName());
         m1.put(c2, c2.getName());

        for(Map.Entry<CustomObject,String> m : m1.entrySet()){
            System.out.println(m.getValue());
        }

        List<String> l1 = new ArrayList<>();
        System.out.println(l1.add("chiru"));
        System.out.println(l1.add("chiru"));
        System.out.println(l1.size());
        System.out.println(l1.toString());
        l1.indexOf("chiru");

    }
    
}