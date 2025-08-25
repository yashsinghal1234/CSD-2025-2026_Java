package p1;

class Employee{
    String name;
    int salary;
    Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    void show(){
        System.out.println("Name : "+name);
        System.out.println("Salary : "+salary);
    }
}

class Manager extends Employee{
    String dtp;
    Manager(String name, int salary, String dtp){
        super(name, salary);
        this.dtp = dtp;
    }
    void showManager(){
        super.show();
        System.out.println("DTP : "+dtp);
    }
}
public class Super {
    public static void main(String[] args) {
        Manager m1 = new Manager("yash",90000,"IT");
        m1.showManager();
    }
}
