package p1;

import java.util.Scanner;

public class classes2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class Employee{
            int ID;
            String name;
            long salary;
            String address;

            void mCalculatIncometax(long salary){
                System.out.println("return income tax");
            }
        }

        Employee emp = new Employee();
        emp.ID = 1;
        emp.name = "John";
        emp.salary = 1000;
        emp.address = "delhi";

        System.out.println("Employee ID is: " + emp.ID);
        System.out.println("Employee name is: " + emp.name);
        emp.mCalculatIncometax(emp.salary);

        Employee emp2 = new Employee();
        emp2.ID = 2;
        emp2.name = "Johny";
        emp2.salary = 10000;
        emp2.address = "mumbai";

        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee();
            System.out.print("Enter employee ID: ");
            employees[i].ID = sc.nextInt();
            System.out.print("Enter employee name: ");
            employees[i].name = sc.next();
            System.out.print("Enter employee salary: ");
            employees[i].salary = sc.nextLong();
            System.out.print("Enter employee address: ");
            employees[i].address = sc.next().toLowerCase();
        }

        for (int i = 0; i < employees.length; i++) {
            if(employees[i].address.equals("delhi")){
                System.out.println(employees[i].name+" lives in delhi");
            }
        }

    }
}
