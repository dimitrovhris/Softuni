package stacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex04BasicQueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for(int i = 0; i < integers[0]; i++){
            queue.offer(numbers[i]);
        }
        for(int i = 1; i <= integers[1]; i++){
            queue.poll();
        }
        if(queue.isEmpty()){
            System.out.println(0);
        }
        else if(queue.contains(integers[2])){
            System.out.println(true);
        }
        else{
            System.out.println(Collections.min(queue));
        }
    }
}
