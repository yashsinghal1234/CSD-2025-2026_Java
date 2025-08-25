package p1;

import java.util.Scanner;

public class classes {
    public static void main(String[] args) {
        class Student{
            //Attributes == properties == state == variable

            String name;
            long roll_no;
            String Branch = "CS";
            char Section = 'D';
            String city;

            int aMarks[] = new int[10];
            // constructor is not seen visibly it is made by compiler and used in the back, but it is like this
            Student(String name, String city){
                this.name = name;
                this.city = city;
            }
            //methods == function in c
            void check_result(){
                System.out.println("Hello");
            }


        }

        //creating an object
        Student s1 = new Student("yash","agra");
        //Student() -> constructor is a method whose name is similar to the class and create size of the required class
        //garbage collector does not delete, it just stores the unused data separate from the heap
        //we can create as many object as we can until the RAM is not filled

        Student[] s2 = new Student[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<s2.length;i++) {
            System.out.print("Student name and city: ");
            s2[i] = new Student(sc.next(), sc.next());
        }
        int count=0;
        System.out.print("Enter the city whose you want to check: ");
        String key =  sc.nextLine();
        for (int i = 0; i < s2.length; i++) {
            if(s2[i].city.equals(key)) {
                count++;
            }
        }
    }
}
