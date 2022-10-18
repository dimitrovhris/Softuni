package examPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class OsPlanning {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] tasks = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] threads = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int taskToKill = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> taskStack = new ArrayDeque<>();
        ArrayDeque<Integer> threadQueue = new ArrayDeque<>();
        Arrays.stream(tasks)
                .forEach(taskStack::push);
        Arrays.stream(threads)
                .forEach(threadQueue::offer);
        int bestThread = 0;
        while(!threadQueue.isEmpty()){
            int currentThread = threadQueue.peek();
            int currentTask = taskStack.peek();
            if(currentTask == taskToKill){
                bestThread = currentThread;
                break;
            }
            threadQueue.poll();
            if(currentThread >= currentTask){
                taskStack.pop();
            }
        }
        System.out.printf("Thread with value %d killed task %d%n", bestThread, taskToKill);
        threadQueue.forEach(e -> System.out.print(e + " "));
    }
}
