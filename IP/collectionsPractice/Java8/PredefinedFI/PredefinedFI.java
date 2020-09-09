package collectionsPractice.Java8.PredefinedFI;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.List;

//Predicate contains only one method which accepts any input and returns boolean output

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
public class PredefinedFI {

    public static void main(String[] args) {
        Predicate<Integer> p = (i)-> i%2==0 && i>10 && i!=11;
        System.out.println(p.test(10));

        Predicate<String> p1 = (s) -> s.length() >=5;
        System.out.println(p1.test("chiru"));

        List<String> s = Arrays.asList("Chiru","Pritam","Arjun","Harish","Keerti");
        List<String> result = s.stream().filter((s1) -> s1.length() >5).collect(Collectors.toList());
        result.stream().forEach(System.out::println);

        Employee e1 = new Employee(007, "Chiru");
        Employee e2 = new Employee(002, "Hari");
        Employee e3 = new Employee(003, "Arjun");
        Employee e4 = new Employee(010, "Keerthi");
        Employee e5 = new Employee(001, "Pritam");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);
        Predicate<Employee> pEmpNo = e-> e.empNo >5;
        Predicate<Employee> pEname = e-> e.empName.length()>5;
        List<Employee> updatedEmployess = employees.stream().filter(pEmpNo.or(pEname)).collect(Collectors.toList());
        updatedEmployess.stream().forEach(e ->System.out.println("Employee Number greater than 5 "+e.empNo + " "+e.empName));

        Consumer<Employee> c = e -> {
            System.out.println("Emp number is: "+e.empNo);
        };
        Consumer<Employee> c1 = e->{
            System.out.println("Emp name is: "+e.empName);
            System.out.println();
        };
        updatedEmployess.stream().forEach(c.andThen(c1));

     }

}