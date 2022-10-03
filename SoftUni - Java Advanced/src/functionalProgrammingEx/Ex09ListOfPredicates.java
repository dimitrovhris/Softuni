package functionalProgrammingEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Ex09ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        List<Integer> array = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        List<Integer> validNums = new ArrayList<>();
        for(int i = 1; i <= num; i++){
           validNums.add(i);
        }
        Predicate<Integer> validFilter = p -> validNum(p, array);
        Consumer<Integer> printer = p -> System.out.print(p + " ");
        validNums.stream()
                .filter(validFilter)
                .forEach(printer);
    }
    public static boolean validNum(int num, List<Integer> list){
        boolean isValid = true;
        for(int n: list){
            if(num % n != 0){
                isValid = false;
                break;
            }
        }
        return isValid;
    }
}
