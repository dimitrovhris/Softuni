package exExam6;

import java.util.Scanner;

public class exam61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rocketPrice = Double.parseDouble(sc.nextLine());
        int rockets = Integer.parseInt(sc.nextLine());
        int trainersPairs = Integer.parseInt(sc.nextLine());

        double trainersPrice = 1.0 * 1/6 * rocketPrice;
        double sum = trainersPairs * trainersPrice + rockets * rocketPrice;
        double otherSum = 0.20 * sum;

        double totalSum = sum + otherSum;

        double novakSum = Math.floor(1.0 * 1/8 * totalSum);
        double sponsorsSum = Math.ceil(1.0 * 7/8 * totalSum);

        System.out.printf("Price to be paid by Djokovic %.0f%n", novakSum);
        System.out.printf("Price to be paid by sponsors %.0f", sponsorsSum);
    }
}
