package functionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex06PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Predicate<String> validName = e-> e.length() <= n;
        String[] names = sc.nextLine().split(" ");
        Arrays.stream(names)
                .filter(validName)
                .forEach(System.out::println);
    }
}
