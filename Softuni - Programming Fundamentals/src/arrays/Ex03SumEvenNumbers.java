package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sumEven = 0;
        for(int item: numbers){
            if(item % 2 == 0){
                sumEven += item;
            }
        }
        System.out.println(sumEven);
    }
}
