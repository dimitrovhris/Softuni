package exExam3;

import java.util.Scanner;

public class exam31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bitcoins = Integer.parseInt(sc.nextLine());
        double yuan = Double.parseDouble(sc.nextLine());
        double commission = Double.parseDouble(sc.nextLine());
        double totalLevs = bitcoins * 1168 + yuan * 0.15 * 1.76;
        double euro = totalLevs / 1.95;
        double totalSum = euro - commission / 100 * euro;
        System.out.printf("%.2f", totalSum);
    }
}
