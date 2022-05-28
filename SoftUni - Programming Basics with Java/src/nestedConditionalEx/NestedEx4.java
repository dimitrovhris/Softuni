package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String flowers = readData.nextLine();
        int flowersCount = Integer.parseInt(readData.nextLine());
        int budget = Integer.parseInt(readData.nextLine());

        double price = 0.00;
        switch (flowers){
            case "Roses":
                price = flowersCount * 5;
                break;
            case "Dahlias":
                price = flowersCount * 3.80;
                break;
            case "Tulips":
                price = flowersCount * 2.80;
                break;
            case "Narcissus":
                price = flowersCount * 3.00;
                break;
            case "Gladiolus":
                price = flowersCount * 2.50;
                break;
        }
        if (flowers.equals("Roses") && flowersCount > 80){
            price = price - 0.10 * price;
        }else if (flowers.equals("Dahlias") && flowersCount > 90){
            price = price - 0.15 * price;
        }else if (flowers.equals("Tulips") && flowersCount > 80){
            price = price - 0.15 * price;
        }else if (flowers.equals("Narcissus") && flowersCount < 120){
            price = price + 0.15 * price;
        }else if (flowers.equals("Gladiolus") && flowersCount < 80){
            price = price + 0.20 * price;
        }
        if (budget >= price){
            double moneyLeft = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowersCount, flowers, moneyLeft);
        }else{
            double moreMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", moreMoney);
        }
    }
}
