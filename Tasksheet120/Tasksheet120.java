package Tasksheet120;
import java.util.*;

public class Tasksheet120 {
    
    public static int sum(int... numbers) {

        int totalSum = 0;

        for (int number : numbers) {
            
            int cumulativeSum = (number * (number + 1)) / 2;
            totalSum += cumulativeSum;

            System.out.println("Cumulative sum for " + number + " is " + cumulativeSum);
        }

        return totalSum;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int[] numbers = new int[3];
        
        System.out.println("Please enter 3 integers:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = scan.nextInt();
        }

        int total = sum(numbers);
        System.out.println("Total sum of cumulative sums is " + total);

        scan.close();
    }
}
