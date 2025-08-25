package Lab_01;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char[] arr = str.toCharArray();
        int n = arr.length-1;
        str = "";
        for (int i = n; i >= 0; i--) {
            str+=arr[i];
        }
        System.out.println("Reverse of the string is "+str);
        boolean flag = true;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[n-i]){
                System.out.println("String is not palindrome");
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("String is palindrome");
        }
    }
}
