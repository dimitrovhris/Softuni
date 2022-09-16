package stacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Ex02BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < integers[0]; i++) {
            stack.push(numbers[i]);
        }
        for (int i = 1; i <= integers[1]; i++) {
            stack.pop();
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(integers[2])) {
            System.out.println("true");
        } else {
            int min = Integer.MAX_VALUE;
            while (!stack.isEmpty()) {
                int currentNum = stack.pop();
                if (currentNum < min) {
                    min = currentNum;
                }
            }
            System.out.println(min);
        }
    }
}
