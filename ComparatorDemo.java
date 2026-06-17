package Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class Employee  {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}

class MyComparator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.id-o2.id;
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        Map<Employee, String> map = new TreeMap<>(new MyComparator());
        map.put(new Employee(1, "raj", 10101), "RAJ");
        map.put(new Employee(4, "amit", 10401), "AMIT");
        map.put(new Employee(3, "ajay", 10105), "AJAY");
        map.put(new Employee(5, "HARI", 12101), "HARI");
        System.out.println(map);


        /*
        Difference between comparator , comparable
            -Both solve different design problem even if output looks same
            -same result != same design

            comparable:
            class decide its own sorting order
            1.natural sorting order
            note: if we are using comparable jvm automatically use compareTO method

            why comparator is customizer:
            Because it is external decision of sorting
            Note: we tell JVM use compare() method by giving comparator object in constructor

            What HashMap really do(internals)

         */
    }
}
