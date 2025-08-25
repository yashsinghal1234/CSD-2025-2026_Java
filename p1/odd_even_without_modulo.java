package p1;

import java.util.*;

public class odd_even_without_modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a number: ");
        int a = sc.nextInt();
        if((a&1)==0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
