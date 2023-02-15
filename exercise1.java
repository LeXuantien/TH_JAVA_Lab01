import java.util.*;

public class exercise1 {
    public static void main(String[] args) {
        if(args.length != 3) System.out.println("Invalid expression");
        else {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[2]);
            if(args[1].equals("+")) System.out.println(a + b);
            else if(args[1].equals("-")) System.out.println(a - b);
            else if(args[1].equals("x")) System.out.println(a * b);
            else if(args[1].equals("/")) System.out.println(a / b);
            else if(args[1].equals( "^")) System.out.println((Math.pow(a, b)));
            else System.out.println("Unsupported operator");
        }
    }
}