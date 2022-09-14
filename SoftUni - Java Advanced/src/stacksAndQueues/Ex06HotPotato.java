package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex06HotPotato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = sc.nextLine().split(" ");
        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, names);

        int n = Integer.parseInt(sc.nextLine());
        while(kids.size() > 1){
            for(int i = 1; i < n; i++){
                kids.offer(kids.poll());
            }
            System.out.printf("Removed %s%n", kids.poll());
        }
        System.out.printf("Last is %s", kids.poll());
    }
}
