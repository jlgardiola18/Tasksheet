package Tasksheet119;
import java.util.*;

public class Tasksheet119 {

    int sum(int a, int b){
        return a + b;
    }

    int difference(int a, int b){
        return a - b;
    }

    int product(int a, int b){
        return a * b;
    }

    int quotient(int a, int b){
        return a / b;
    }

    public static void main(String[] args) {

        Tasksheet119 method = new Tasksheet119();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 1st Number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter a 2nd Number: ");
        int num2 = scanner.nextInt();

        System.out.println("The Sum is " + method.sum(num1, num2));
        System.out.println("The Difference is " + method.difference(num1, num2));
        System.out.println("The Product is " + method.product(num1, num2));
        System.out.println("The Quotient is " + method.quotient(num1, num2));
    
    }
}
