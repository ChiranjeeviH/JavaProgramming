package collectionsPractice.Java8.FunctionalInteraceEX;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// class MyComparator implements Comparator<Integer>{

//     public int compare(Integer i1, Integer i2){

//         return (i1>i2)?-1:(i1<i2)?1:0;

//     }
// }

class Employee{
    int empNo;
    String empName;

    Employee(int empNo, String empName){
        this.empNo = empNo;
        this.empName = empName;
    }

    public String toString(){
        return "EmployeeNo: "+empNo + "    "+"EmployeeName: " +empName;
    }
}

public class Collections1Dot8 {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        myList.addAll(Arrays.asList(10,5,30,20,40,0));
        Collections.sort(myList);
        //System.out.println("Before sorting the list elements are: "+myList);
        Comparator<Integer> com = (i1,i2) -> (i1>i2)?1:(i1<i2)?-1:0;
        Collections.sort(myList , com);
       // System.out.println("After sorting the list elements are: "+myList);
        myList.stream().forEach(System.out::println);
        //Filtering and set the modified list using streams
        List<Integer> updatedMyList = myList.stream().filter(i -> i%2==0).collect(Collectors.toList());
        //System.out.println("Printing updated list after filterning using streams");
        updatedMyList.forEach(System.out::println);

        System.out.println("using lamda expression on custom classes with comparator ");

        Employee e1 = new Employee(007, "Chiru");
        Employee e2 = new Employee(002, "Hari");
        Employee e3 = new Employee(003, "Arjun");
        Employee e4 = new Employee(010, "Keerthi");
        Employee e5 = new Employee(001, "Pritam");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
        Comparator<Employee> c = (empObj1 , empObj2) -> empObj1.empNo>empObj2.empNo ? -1:empObj1.empNo<empObj2.empNo?1:0;
        Comparator<Employee> c1 = (empObj1 , empObj2) -> empObj1.empName.compareTo(empObj2.empName);
        Collections.sort(employees , c);
        System.out.println("After sorting the employee objects based on empno using comparator and lamda expressions");
        employees.forEach(System.out::println);
        Collections.sort(employees , c1);
        System.out.println("After sorting the employee objects based on empname using comparator and lamda expressions");
        employees.forEach(System.out::println);

        


    }
}