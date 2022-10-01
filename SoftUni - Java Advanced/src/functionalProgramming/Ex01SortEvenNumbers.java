package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex01SortEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<String> evenNums = new ArrayList<>();
        list.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e-> evenNums.add(String.valueOf(e)));
        ;
        System.out.println(String.join(", ", evenNums));
        List<String> sortedNums = evenNums.stream()
                .mapToInt(Integer::parseInt)
                .sorted()
                .mapToObj(String::valueOf)
                        .collect(Collectors.toList());
        System.out.println(String.join(", ", sortedNums));
    }
}
