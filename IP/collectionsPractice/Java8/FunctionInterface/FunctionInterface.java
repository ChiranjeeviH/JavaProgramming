package collectionsPractice.Java8.FunctionInterface;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;


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

public class FunctionInterface {

    public static void main(String[] args) {
        Function<Integer, Integer> fun = i -> i*i;
        System.out.println("The Multiplicatation of the two numbers are: "+fun.apply(3));
        System.out.println("The Multiplicatation of the two numbers are: "+fun.apply(4));

        Function<String, Integer> fun1 = s -> s.length();

        Function<Integer, Integer> fun2 = i -> i+i;

        System.out.println("The length of the string is: "+fun1.apply("Chiru"));

        System.out.println("The usage of 2 functions individually : "+(fun.apply(3)+fun2.apply(3)));

        System.out.println("The usage of function andThen method: "+fun.andThen(fun2).apply(3));

        System.out.println("The usage of function compose method: "+fun.compose(fun2).apply(3));

        Employee e1 = new Employee(007, "Chiru");
        Employee e2 = new Employee(002, "Hari");
        Employee e3 = new Employee(003, "Arjun");
        Employee e4 = new Employee(010, "Keerthi");
        Employee e5 = new Employee(001, "Pritam");

        List<Employee> employees = Arrays.asList(e1,e2,e3,e4,e5);

        Function<Employee , String> empFun = e -> {
            String s = "";
            Predicate<Employee> p = emp -> emp.empNo >2;

           s =  p.test(e)?e.empName:""+e.empNo;

           return s;
        };

        List<String> updatedList = employees.stream().map(empFun).collect(Collectors.toList());
        updatedList.forEach(s -> System.out.println( "the employee number > 2 are: " + s));

        Supplier<String> s = () ->{
            String otp ="";
            for(int i=0;i<6;i++){
                otp+=(int) (Math.random()*10);
            }
            return otp;
        };

        System.out.println("OTP for the transaction is: "+s.get());



    }

    

}