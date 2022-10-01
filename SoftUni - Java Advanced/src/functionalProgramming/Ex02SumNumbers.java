package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Ex02SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Function<String, Integer> sumNumbers = input -> Arrays.stream(input.split(", "))
                .mapToInt(Integer::parseInt).sum();

        Function<String, Integer> countNumbers = input -> input.split(" ").length;

        String input = sc.nextLine();
        System.out.println("Count = " + countNumbers.apply(input));
        System.out.println("Sum = "+ sumNumbers.apply(input));
    }
}
