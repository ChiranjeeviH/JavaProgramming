package collectionsPractice.Java8.FunctionalInteraceEX;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import collectionsPractice.Java8.FunctionalInteraceEX.Employee;

public class StreamsExamples {


    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(2,3,1,5,7,4);
        myList.sort(Comparator.reverseOrder());
        myList.stream().forEach(System.out::println);

        Employee e = new Employee(1, "chiru");
        Employee e1 = new Employee(3, "hari");
        Employee e2 = new Employee(2, "sandhya");

        List<Employee> employeeList = Arrays.asList(e,e1,e2);

        String s= "CHIRU IS A GOOD BOY";
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split(" ");
        for(String es:ss){
            sb.append(es.charAt(0)+es.substring(1,es.length()).toLowerCase());
            sb.append(" ");
        }
        System.out.println(sb.toString());
    }
    
}