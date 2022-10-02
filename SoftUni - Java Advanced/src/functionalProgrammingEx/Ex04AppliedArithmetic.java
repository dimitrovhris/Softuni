package functionalProgrammingEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex04AppliedArithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        String command = sc.nextLine();
        Function<List<Integer>, List<Integer>> add = numbers->
           numbers.stream().map(num -> num + 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> subtract = numbers->
                numbers.stream().map(num -> num - 1).collect(Collectors.toList());
        Function<List<Integer>, List<Integer>> multiply = numbers->
                numbers.stream().map(num -> num * 2).collect(Collectors.toList());
        Consumer<Integer> printer = e -> System.out.print(e + " ");

        while (!command.equals("end")) {
            switch (command){
                case "add":
                    nums = add.apply(nums);
                    break;
                case "subtract":
                    nums = subtract.apply(nums);
                    break;
                case "multiply":
                    nums = multiply.apply(nums);
                    break;
                case "print":
                    nums.forEach(printer);
                    System.out.println();
                    break;
            }
            command = sc.nextLine();
        }
    }
}
