package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Ex03CountUppercaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Predicate<String> isUpperWord = word -> Character.isUpperCase(word.charAt(0));
        List<String> validWords = new ArrayList<>();
        String input = sc.nextLine();
        Arrays.stream(input.split(" "))
                .filter(isUpperWord)
                .forEach(validWords::add);
        System.out.println(validWords.size());
        validWords
                .forEach(System.out::println);
    }
}
