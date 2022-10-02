package functionalProgrammingEx;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Ex05ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Collections.reverse(nums);
        int n = Integer.parseInt(sc.nextLine());
        Consumer<Integer> printer = e -> System.out.print(e + " ");
        nums.stream()
                .filter(e -> e % n != 0)
                .forEach(printer);
    }
}
