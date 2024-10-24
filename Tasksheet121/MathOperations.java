package Tasksheet121;

import static java.lang.Math.*;
import java.util.*;

public class MathOperations  {

    public static int add(int a, int b) {
        return addExact(a, b);
    }

    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    public static float divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a 1st Number: ");
        int num1 = scan.nextInt();

        System.out.print("Enter a 2nd Number: ");
        int num2 = scan.nextInt();

        System.out.println("The Sum is " + add(num1, num2));
        System.out.println("The Difference is " + subtract(num1, num2));
        System.out.println("The Product is " + multiply(num1, num2));
        System.out.println("The Quotient is " + divide(num1, num2));
        
    }
}