package basicSynatx;

import java.util.Scanner;

public class Basic12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        while(num % 2 != 0){
            System.out.println("Please write an even number.");
            num = Integer.parseInt(sc.nextLine());
        }
        System.out.println(Math.abs(num));
    }
}
