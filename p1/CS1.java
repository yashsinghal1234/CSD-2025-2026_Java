package p1;

public class CS1 {
    public static void main(String[] args) {
        System.out.println("Hello World");

        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); // above three points are where we run with parameter
        }
    }
}

class AA{
    public static void main(String[] args) {
        System.out.println("Aa Data");
        CS1.main(new String[]{"hello yash","aj"}); // we can call other main like this because of the static
        // here we call using the class because in static we don't create the object to call
    }
}
