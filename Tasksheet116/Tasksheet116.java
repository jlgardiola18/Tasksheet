package Tasksheet116;
import java.util.*;

public class Tasksheet116{
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String name = scan.nextLine();
        StringBuilder builder = new StringBuilder(name);
        StringBuilder redliub = new StringBuilder(builder.reverse());

        if(name.equals(builder.toString())){
            System.out.println("The input string is a palindrome.");
        }
        else{
            System.out.println("The input string is not a palindrome.");
        }
    }
}