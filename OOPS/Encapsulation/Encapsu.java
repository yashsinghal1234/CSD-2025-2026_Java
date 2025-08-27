package OOPS.Encapsulation;

import java.lang.reflect.Field;

// binding of the data and actions together in one class is encapsulation
// to encapsulate we have to private
// to get getter and setter method right click near the variable and click the generate and then make getter and setter and then select all the variable
// using getter and setter we can get the private data
// but we can bypass these process
// by reflection method we can use but it is illegal way
class Employee{
    private double salary;
    private String name;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Encapsu {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello");
        // reflection
//        Employee emp = new Employee();
//        Field fsalary = Employee.class.getDeclaredField("salary");
//        fsalary.setAccessible(true);
//        System.out.println("salary: " + fsalary.get(emp));

        Employee emp = new Employee();
        emp.setSalary(10000);
        System.out.println(emp.getSalary());
    }
}
