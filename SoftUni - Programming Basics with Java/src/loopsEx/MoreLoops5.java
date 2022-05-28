package loopsEx;

import java.util.Scanner;

public class MoreLoops5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int moves = Integer.parseInt(readData.nextLine());
        double sum = 0;
        int num0To9 = 0;
        int num10to19 = 0;
        int num20to29 = 0;
        int num30to39 = 0;
        int num40to50 = 0;
        int invalidNumbers = 0;
        double totalNumbers = 0;
        double points = 0;


        for (int i = 1; i <= moves; i++) {
            double number = 0;
            number = Integer.parseInt(readData.nextLine());
            if (number >= 0 && number <= 9) {
                points = 0.20 * number;
                num0To9++;
            } else if (number >= 10 && number <= 19) {
                points = 0.30 * number;
                num10to19++;
            } else if (number >= 20 && number <= 29) {
                points = 0.40 * number;
                num20to29++;
            } else if (number >= 30 && number <= 39) {
                points = 50;
                num30to39++;
            } else if (number >= 40 && number <= 50) {
                points = 100;
                num40to50++;
            } else if (number < 0 || number > 50){
                points = number / 2;
                invalidNumbers++;
            }
            sum = sum + points;
            totalNumbers++;
        }
        double percent0to9 = num0To9 * 100 / totalNumbers;
        double percent10to19 = num10to19 * 100 / totalNumbers;
        double percent20to29 = num20to29 * 100 / totalNumbers;
        double percent30to39 = num30to39 * 100 / totalNumbers;
        double percent40to50 = num40to50 * 100 / totalNumbers;
        double percentInvalidNumbers = invalidNumbers * 100 / totalNumbers;

        System.out.printf("%.2f%n", sum);
        System.out.printf("From 0 to 9: %.2f%%%n", percent0to9);
        System.out.printf("From 10 to 19: %.2f%%%n", percent10to19);
        System.out.printf("From 20 to 29: %.2f%%%n", percent20to29);
        System.out.printf("From 30 to 39: %.2f%%%n", percent30to39);
        System.out.printf("From 40 to 50: %.2f%%%n", percent40to50);
        System.out.printf("Invalid numbers: %.2f%%", percentInvalidNumbers);
    }
}
