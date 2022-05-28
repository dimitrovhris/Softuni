package exExam5;

import java.util.Scanner;

public class exam51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double flourPrice = Double.parseDouble(sc.nextLine());
        double kgFlour = Double.parseDouble(sc.nextLine());
        double kgSugar = Double.parseDouble(sc.nextLine());
        int eggsPackets = Integer.parseInt(sc.nextLine());
        int yeastPackets = Integer.parseInt(sc.nextLine());

        double sugarPrice = 0.75 * flourPrice;
        double eggsPrice = 1.1 * flourPrice;
        double yeastPrice = 0.20 * sugarPrice;

        double totalSum = kgFlour * flourPrice + eggsPackets * eggsPrice + kgSugar * sugarPrice + yeastPackets * yeastPrice;

        System.out.printf("%.2f", totalSum);
    }
}
