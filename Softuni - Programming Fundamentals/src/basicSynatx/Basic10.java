package basicSynatx;

import java.util.Scanner;

public class Basic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= 10; i++){
            int result = i * num;
            System.out.printf("%d X %d = %d", num, i, result);
        }
    }
}
