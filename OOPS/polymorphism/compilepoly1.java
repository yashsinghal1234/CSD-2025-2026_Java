package OOPS.polymorphism;

//Static or early binding is known as compile time polymorphism
// operator overloading does not allowed by java only + sign is overloaded that even by java not by user
// we can overload the main method also
// we can also overload the constructor
// overloading does not depend upon the return type of the method
public class compilepoly1 {
    compilepoly1(){

    }

    compilepoly1(String name){

    }

    public static void main(String[] args) {
        System.out.println("A");
        compilepoly1 cc =new compilepoly1();
        cc.m1();
    }

    public static void main() {
        System.out.println("E");
    }

    void m1(int a){
        System.out.println("B");
    }

    void m1(int a,String b){
        System.out.println("C");
    }

    void m1(){
        System.out.println("D");
    }
}
