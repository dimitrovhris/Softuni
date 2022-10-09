package workshop1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmartArray smartArray = new SmartArray();
        CustomStack customStack = new CustomStack();
        customStack.push(1);

        System.out.println(customStack.pop());
        System.out.println(customStack.peek());
        customStack.forEach(System.out::println);
    }
}
