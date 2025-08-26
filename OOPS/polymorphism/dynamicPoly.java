package OOPS.polymorphism;
// Dynamic or late binding is know as run time polymorphism
// this is a concept of override
// main cannot be override
// constructor cannot be override
// coverience data type can be return type of the methods if both are not same
class A1{
    void m1(){
        System.out.println("Coming from m1 method");
    }
//    Object m1(){
//        System.out.println("Coming from m1 method");
//    }
}

class B1 extends A1{
    @Override
    void m1(){
        System.out.println("Coming from m2 method");
    }
//    String m1(){
//        System.out.println("Coming from m2 method");
//    }
}
public class dynamicPoly {
    public static void main(String[] args) {
        System.out.println("A");
        A1 b1 = new B1();
        b1.m1();
    }
}
