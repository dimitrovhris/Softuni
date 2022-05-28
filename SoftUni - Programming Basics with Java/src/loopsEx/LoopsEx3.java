package loopsEx;

import java.util.Scanner;

public class LoopsEx3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int n = Integer.parseInt(readData.nextLine());
        double oddMin = 100000000000000000.0;
        double oddMax = -100000000000000000.0;
        double evenMin = 1000000000000000000000.0;
        double evenMax = -10000000000000000000000.0;
        double oddSum = 0.0;
        double evenSum = 0.0;

        for (int i = 1; i <= n; i++) {
            double number = Double.parseDouble(readData.nextLine());
            if (i % 2 == 1) {
                oddSum = oddSum + number;
                if (number < oddMin) {
                    oddMin = number;
                }
                if (number > oddMax) {
                    oddMax = number;
                }
            } else if (i % 2 == 0) {
                evenSum = evenSum + number;
                if (number < evenMin) {
                    evenMin = number;
                }
                if (number > evenMax) {
                    evenMax = number;
                }
            }
        }
        System.out.printf("OddSum = %.2f\n", oddSum);
        System.out.print("OddMin = ");
        if (oddMin != 100000000000000000.0){
            System.out.printf("%.2f\n",oddMin);
        }else{
            System.out.println("No");
        }
        System.out.print("OddMax = ");
        if (oddMax != -100000000000000000.0){
            System.out.printf("%.2f\n",oddMax);
        }else{
            System.out.println("No");
        }
        System.out.printf("EvenSum = %.2f\n", evenSum);
        System.out.print("EvenMin = ");
        if (evenMin != 1000000000000000000000.0){
            System.out.printf("%.2f\n",evenMin);
        }else{
            System.out.println("No");
        }
        System.out.print("EvenMax = ");
        if (evenMax != -10000000000000000000000.0){
            System.out.printf("%.2f\n",evenMax);
        }else{
            System.out.println("No");
        }
    }
}
