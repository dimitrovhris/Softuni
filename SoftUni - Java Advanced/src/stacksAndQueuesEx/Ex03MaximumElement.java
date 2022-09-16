package stacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class Ex03MaximumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            if(input.charAt(0) == '1'){
                int elementToPush = Integer.parseInt(input.split(" ")[1]);
                stack.push(elementToPush);
            } else if(input.charAt(0) == '2'){
                stack.pop();
            } else{
                System.out.println(Collections.max(stack));
            }
        }
    }
}
