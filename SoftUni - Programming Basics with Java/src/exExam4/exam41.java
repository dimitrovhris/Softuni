package exExam4;

import java.util.Scanner;

public class exam41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breads = Integer.parseInt(sc.nextLine());
        int eggPackets = Integer.parseInt(sc.nextLine());
        int cookies = Integer.parseInt(sc.nextLine());

        double totalSum = breads * 3.20 + eggPackets * 4.35 + cookies * 5.40 + eggPackets * 12 * 0.15;
        System.out.printf("%.2f", totalSum);
    }
}
