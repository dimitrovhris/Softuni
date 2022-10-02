package functionalProgrammingEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ex07FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        Function<List<Integer>, Integer> minNum = e -> minNum(e);
        System.out.println(list.lastIndexOf((minNum.apply(list))));
    }

    public static int minNum(List<Integer> list) {
        int minNum = Integer.MAX_VALUE;
        for (int n : list) {
            if (n < minNum) {
                minNum = n;
            }
        }
        return minNum;
    }
}
