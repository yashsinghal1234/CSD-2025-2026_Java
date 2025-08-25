package p1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS2 {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("New main");

        Scanner sc = new Scanner(new File("p1/aa.txt")); // to take the input from a file we give it new File(pathname)
        // we also need to import the java.io.File


//        System.out.printf("%c,%d,%f",'a',2,2.2); //we can use printf
//        System.out.print("Enter here");
//        String name = sc.nextLine();
//        System.out.println(name);
//
        String da = sc.nextLine(); // it will give the first thing
        System.out.println(da);
    }
}
