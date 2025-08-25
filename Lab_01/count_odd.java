package Lab_01;

import java.util.Scanner;

public class count_odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int sum = 0;
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                count++;
                sum+=i;
            }
        }
        System.out.println("Count of odd numbers: "+count);
        System.out.println("Sum of odd numbers: "+sum);
    }
}
