package arraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex06EqualSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean no = true;
        for (int i = 0; i <= arr.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;
            if (i != 0) {
                for (int j = 0; j <= i - 1; j++) {
                    leftSum += arr[j];
                }
            }
            if (i != arr.length-1) {
                for (int k = i + 1; k <= arr.length - 1; k++) {
                    rightSum += arr[k];
                }
            }
            if (leftSum == rightSum) {
                System.out.println(i);
                no = false;
                break;
            }
        }
        if(no)
            System.out.println("no");
    }
}