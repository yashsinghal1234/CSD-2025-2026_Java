package Lab_01;

import java.util.*;

public class largest_and_smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = input.nextInt();
        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The largest number is "+max);
        System.out.println("The smallest number is "+min);
    }
}
