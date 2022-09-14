package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex03DecimalToBinaryConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        ArrayDeque <Integer> binary = new ArrayDeque<>();
        if(num != 0) {
            while (num != 0) {
                binary.push(num % 2);
                num /= 2;
            }
            for(int digit: binary){
                System.out.printf("%d", digit);
            }
        }
        else{
            System.out.println(0);
        }
    }
}
