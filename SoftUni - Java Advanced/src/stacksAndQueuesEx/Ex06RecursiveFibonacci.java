package stacksAndQueuesEx;

import java.util.Scanner;

public class Ex06RecursiveFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long result = fib(n);
        System.out.println(result);
    }
    public static long fib (int n){
        if(n < 2){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
