package stacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Ex01ReversNumbersWithAStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(int num: numbers){
            stack.push(num);
        }
        while(!stack.isEmpty()){
            System.out.printf("%d ", stack.pop());
        }
    }
}
