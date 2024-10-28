package Tasksheet124;

import java.util.*;
import java.util.function.*;

public class Tasksheet124{

    static List<Integer> filteredNumber(List<Integer> numbers,Predicate<Integer> condition){
        List<Integer> result= new ArrayList<>();
            for(int num:numbers){
                if(condition.test(num))
                result.add(num);
            }
            return result; 
        }
    public static void main(String[] args) {

    List<Integer> numbers = Arrays.asList(3, -2, 10, 15, -7, 8, 0, 21, -3, 5);

    System.out.println("Original List: " + numbers);

    Predicate<Integer> positive = n -> n >= 0;
    Predicate<Integer> even = n -> n % 2 == 0;
    Predicate<Integer> ten = n -> n > 10;

    System.out.println("Positive Numbers: " + filteredNumber(numbers, positive));
    System.out.println("Even Numbers: " + filteredNumber(numbers, even));
    System.out.println("Numbers Greater Than 10: " + filteredNumber(numbers, ten));

    }    
}