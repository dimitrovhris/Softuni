package loopsEx;
import java.util.Scanner;
public class MoreLoops6 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int months = Integer.parseInt(readData.nextLine());
        double electricitySum = 0;
        double waterSum = 0;
        double internetSum = 0;
        double othersSum = 0;
        double totalForAllMonths = 0;
        double averageForMonth = 0;

        for (int i = 1; i<= months; i++){
            double electricityPrice = Double.parseDouble(readData.nextLine());
            double waterPrice = 20.00;
            double internetPrice = 15.00;
            double othersPrice = (electricityPrice + waterPrice + internetPrice)
                    + 0.20 * (electricityPrice + waterPrice + internetPrice);
            double totalForMonth = electricityPrice + waterPrice + internetPrice + othersPrice;
            totalForAllMonths += totalForMonth;
            electricitySum += electricityPrice;
            waterSum += waterPrice;
            internetSum += internetPrice;
            othersSum += othersPrice;
            averageForMonth = totalForAllMonths / months;
        }
        System.out.printf("Electricity: %.2f%n", electricitySum);
        System.out.printf("Water: %.2f%n", waterSum);
        System.out.printf("Internet: %.2f%n", internetSum);
        System.out.printf("Other: %.2f%n", othersSum);
        System.out.printf("Average: %.2f", averageForMonth);
    }
}
