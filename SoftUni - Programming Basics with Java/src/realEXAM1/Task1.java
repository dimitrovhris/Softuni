package realEXAM1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double processorPrice = Double.parseDouble(sc.nextLine());
        double videoCardPrice = Double.parseDouble(sc.nextLine());
        double ramPrice = Double.parseDouble(sc.nextLine());
        int totalRams = Integer.parseInt(sc.nextLine());
        double percentDiscount = Double.parseDouble(sc.nextLine());

        double ramSumLv = ramPrice * totalRams * 1.57;
        double videoCardSumLv = videoCardPrice * 1.57;
        double processorPriceLv = processorPrice * 1.57;

        videoCardSumLv -= percentDiscount * videoCardSumLv;
        processorPriceLv -= processorPriceLv * percentDiscount;

        double totalSum = ramSumLv + videoCardSumLv + processorPriceLv;
        System.out.printf("Money needed - %.2f leva.", totalSum);

    }
}
