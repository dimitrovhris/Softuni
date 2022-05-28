package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        int sum = 0;
        for(int i = begin; i <= end; i++){
            System.out.printf("%d ", i);
            sum+=i;
        }
        System.out.println();
        System.out.printf("Sum: %d", sum);
    }
}
