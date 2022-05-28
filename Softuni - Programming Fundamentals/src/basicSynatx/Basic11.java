package basicSynatx;

import java.util.Scanner;

public class Basic11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        if(num1 <= 10 && num2 <= 10){
            for(int i = num2; i <= 10; i++){
                System.out.printf("%d X %d = %d%n", num1, i, num1 * i);
            }
        }
        else{
            System.out.printf("%d X %d = %d", num1, num2, num1 * num2);
        }
    }
}
