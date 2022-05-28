package simpleCalculationsEx;

import java.util.Scanner;

public class SimpleEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int price = Integer.parseInt(sc.nextLine());
        double trainersPrice = 0.60 * price;
        double outfitPrice = 0.80 * trainersPrice;
        double ballPrice = 0.25 * outfitPrice;
        double accessoriesPrice = 0.20 * ballPrice;

        double totalPrice = price + trainersPrice + outfitPrice + ballPrice + accessoriesPrice;

        System.out.println(totalPrice);
    }
}
