package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex07CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        if (array.length != 1) {
            for (int j = array.length-1; j >= 1; j--) {
                int[] newArray = new int[j];
                for (int i = 0; i <= array.length - 2; i++) {
                    int sum = array[i] + array[i + 1];
                    newArray[i] = sum;
                }
                array = newArray;
            }
            System.out.println(array[0]);
        } else {
            System.out.printf("%d", array[0]);
        }
    }
}
