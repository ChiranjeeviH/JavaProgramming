package collectionsPractice.setIntefaceImplementations;

import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
/*
Set is an iterface which extends Collection. it doesn't allow dulicates vales and return unordered
values.
implementaions of set interface are HashSet,LinkedHashSet,TreeSet(Sorted representation)

*/
public class SetImplementations {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Chiru");
        set.add("Chiru");
        set.add("set");
        set.add("HashSet");
        System.out.println("Adding an element to set :"+set.add("using add method"));
        System.out.println("Size of the set is :"+set.size());
        System.out.println("Contains the value in set of :" +set.contains(new String("set")));
        System.out.println("Check if the set is empty or not :"+set.isEmpty());
        Iterator<String> setIterator = set.iterator();
        while(setIterator.hasNext()){
            System.out.println("Printing values over iterator :"+setIterator.next());
        }
        set.retainAll(Arrays.asList("Chiru","set"));
        System.out.println("After retaining the following values Chiru,set from the set :"+set);
        set.removeIf(s->s.contains("Chiru"));
        System.out.println("after removing predicate the set results :"+set);
        set.addAll(Arrays.asList("This","is","Collection","From","Array"));
        System.out.println("after adding elements using addAll Collection :"+set);
        System.out.println(set.parallelStream().allMatch(s->s.equalsIgnoreCase("chiru")));
    }
    

}