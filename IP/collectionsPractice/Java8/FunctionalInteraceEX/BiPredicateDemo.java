package collectionsPractice.Java8.FunctionalInteraceEX;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.List;
import java.util.Arrays;

class Employee1{
    int empNo;
    String empName;
    Double salary;

    Employee1(int empNo, String empName, Double salary){
        this.empNo = empNo;
        this.empName = empName;
        this.salary = salary;
    }

    public String toString(){
        return "EmployeeNo: "+empNo +" EmployeeName: " +empName+" salary"+salary;
    }
}
public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<Integer,Integer> b = (x,y) -> (x*y)%2 ==0;
        BiPredicate<Integer,Integer> b1 = (x,y) -> (x+y)%2 ==0;
        System.out.println(b.test(3, 2));
        System.out.println(b.test(3, 3));
        System.out.println(b.and(b1).test(3, 2));


        Employee1 e1 = new Employee1(007, "Chiru",70000.0);
        Employee1 e2 = new Employee1(002, "Hari",40000.0);
        Employee1 e3 = new Employee1(003, "Arjun",150000.0);
        Employee1 e4 = new Employee1(010, "Keerthi",50000.0);
        Employee1 e5 = new Employee1(001, "Pritam",10000.0);

        List<Employee1> employees = Arrays.asList(e1,e2,e3,e4,e5);

        BiPredicate<Employee1,Employee1> empBiPredicate = (x,y) -> x.salary > y.salary; 
        System.out.println(empBiPredicate.test(e1, e3));

        BiFunction<Integer,Integer,Integer> biFunction = (x,y) -> x*y;
        Function<Integer,Integer> biFunction1 = (x) -> x+x;
        System.out.println(biFunction.apply(2, 3));
        System.out.println(biFunction.andThen(biFunction1).apply(2,3));
    }

}