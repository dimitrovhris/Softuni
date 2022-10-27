package hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        double price = PriceCalculator.calculateHolidayPrice(data);
        System.out.printf("%.2f", price);
    }
}
