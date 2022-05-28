package exExam2;

import java.util.Scanner;

public class exam21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double hallPrice = Double.parseDouble(sc.nextLine());
        double cakePrice = 0.20 * hallPrice;
        double drinksPrice = cakePrice - 0.45 * cakePrice;
        double animatorPrice = hallPrice / 3;
        double totalSum = hallPrice + cakePrice + drinksPrice + animatorPrice;
        System.out.println(totalSum);
    }
}
