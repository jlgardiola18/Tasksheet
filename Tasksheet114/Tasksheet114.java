package Tasksheet114;
import java.util.*;

public class Tasksheet114 {
    @SuppressWarnings("resource")
    public static void main(String[] args) {

        int check_number = 10;

        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a number: ");
        check_number = sc.nextInt();

        for (int i = 1; i <= check_number; i++) {
            if ((i % 2) == 0) {
                String message = i + " is even number";
                System.out.println(message);
                // System.out.print(i + " is even number");
            } else if ((check_number % 2) >= 0) {
                String message = i + " is odd number";
                System.out.println(message);
                // System.out.print("\n" + i + " is odd number");
            }
        }
        
    }
}