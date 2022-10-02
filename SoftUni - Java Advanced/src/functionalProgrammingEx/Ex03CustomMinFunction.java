package functionalProgrammingEx;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Ex03CustomMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], Integer> findMin = e -> minNumber(e);
        System.out.println(findMin.apply(array));
    }
    public static int minNumber (int[] array){
        int minNum = Integer.MAX_VALUE;
        for(int num: array){
            if(num < minNum){
                minNum = num;
            }
        }
        return minNum;
    }
}
