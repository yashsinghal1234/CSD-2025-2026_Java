package Lab_01;

import java.util.Scanner;

public class sum_of_command_line_argument {
    public static void main(String[] args) {
        int sum =0;
        for(int i=0;i<args.length;i++) {
            sum+=Integer.parseInt(args[i]);
        }
        System.out.println(sum);
    }
}
