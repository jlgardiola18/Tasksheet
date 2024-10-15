package Tasksheet117;
import java.util.*;

public class Tasksheet117 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
          
        System.out.print("Enter a 1st Number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a 2nd Number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter a 3rd Number: ");
        int num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3){
            System.out.println("1st");
            System.out.println(num1 + " is the largest input number.");
        }
        else if(num2 > num1 && num2 > num3){
            System.out.println("2nd");
            System.out.println(num2 + " is the largest input number.");
        }
        else if(num3 > num1 && num3 > num2){
            System.out.println("3rd");
            System.out.println(num3 + " is the largest input number.");
        }
        else if (num1 == num2 && num1 == num3 && num2 == num3){
            System.out.println("All numbers are equal.");
        }
        else if(num1 == num2){
            System.out.println("1st & 2nd number are both equal.");
        }
        else if(num1 == num3){
            System.out.println("1st & 3rd number are both equal.");
        }
        else if(num2 == num3){
            System.out.println("2nd & 3rd number are both equal.");
        }




        

        // System.out.println(num1 + num2 + num3);

    
        
    }
}
