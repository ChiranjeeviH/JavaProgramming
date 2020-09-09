package collectionsPractice;

import java.util.Calendar;
import java.util.Date;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

public class DateTest {

    public static void main(String[] args) {
       Calendar cal = Calendar.getInstance();
       Date currentDate = cal.getTime();
       System.out.println(currentDate);
       cal.add(Calendar.YEAR, -15);
       Date fift = cal.getTime();
       System.out.println(fift);


       List<Integer> ll = new ArrayList<>();
       ll.add(10);

       List<Integer> l2 = ll.stream().skip(1).collect(Collectors.toList());
       l2.forEach(System.out::println);
    }
    
}