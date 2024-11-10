package Tasksheet130;

import java.util.*;

class Division {
    public int num1;
    public int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getQuotient() {
        return num1 / num2;
    }
}

public class Tasksheet130 {
    public static void main(String[] args) {

        Division division = new Division();

        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Enter the first number: ");
            division.setNum1(scanner.nextInt());
            
            System.out.print("Enter the second number: ");
            division.setNum2(scanner.nextInt());
            
            System.out.println("Result: " + division.getQuotient());

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred." + e.getMessage());
        }

        scanner.close();

    }
}

