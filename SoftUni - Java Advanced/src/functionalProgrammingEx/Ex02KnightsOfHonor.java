package functionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ex02KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        Consumer<String> printer = e -> System.out.println("Sir " + e);
        Arrays.stream(names)
                .forEach(printer);
    }
}
