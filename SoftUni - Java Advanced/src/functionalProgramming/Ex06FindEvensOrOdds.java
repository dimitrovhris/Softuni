package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Ex06FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] data = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        String function = sc.nextLine();
        Predicate<Integer> filterNums = isEven(function);
        Consumer<Integer> printNums = e -> System.out.print(e + " ");
        List<Integer> nums = new ArrayList<>();
        for(int i = data[0]; i <= data[1]; i++){
            nums.add(i);
        }
        nums.stream()
                .filter(filterNums)
                .forEach(printNums);
    }
    public static Predicate<Integer> isEven(String type) {
        switch(type){
            case "even":
                return p -> p % 2 == 0 ;
            default:
                return p -> p % 2 == 1 || p % 2 == -1;
        }
    }
}
