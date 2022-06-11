package methods;

import java.util.Scanner;

public class Ex05Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        totalPrice(product, count);
    }
    public static void totalPrice(String product, int countOfProducts){
        double price = 0;
        switch(product){
            case "coffee":
                price = 1.50;
                break;
            case "water":
                price = 1.00;
                break;
            case "coke":
                price = 1.40;
                break;
            case "snacks":
                price = 2.00;
                break;
        }
        System.out.printf("%.2f" , countOfProducts * price);
    }
}
