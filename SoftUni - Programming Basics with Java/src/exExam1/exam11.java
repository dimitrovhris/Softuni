package exExam1;

import java.util.Scanner;

public class exam11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String airCompany = sc.nextLine();
        int adultsTickets = Integer.parseInt(sc.nextLine());
        int kidsTickets = Integer.parseInt(sc.nextLine());
        double adultPrice = Double.parseDouble(sc.nextLine());
        double serviceFee = Double.parseDouble(sc.nextLine());

        double kidsPrice = 0.30 * adultPrice + serviceFee;
        adultPrice += serviceFee;
        double totalSum = 0.20 * (adultsTickets * adultPrice + kidsTickets * kidsPrice);
        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airCompany, totalSum);
    }
}
