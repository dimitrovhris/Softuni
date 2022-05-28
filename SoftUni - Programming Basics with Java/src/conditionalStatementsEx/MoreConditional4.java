package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int kilometers = Integer.parseInt(readData.nextLine());
        String amPm = readData.nextLine();

        double taxiPrice = 0;
        double busPrice = 0;
        double trainPrice = 0;
        double cheapestTransport = 0.00;

        if (amPm.equals("day")){
            taxiPrice = 0.70 + 0.79 * kilometers;
        }
        else {
            taxiPrice = 0.70 + 0.90 * kilometers;
        }
        if (kilometers >= 20 & kilometers <100){
            busPrice = 0.09 * kilometers;
            cheapestTransport = Math.min(busPrice,taxiPrice);
        }
        else if (kilometers >=100){
            trainPrice = 0.06 * kilometers;
            cheapestTransport = Math.min(trainPrice, taxiPrice);
        }
        else{
            cheapestTransport = taxiPrice;
        }

        System.out.printf("%.2f", cheapestTransport);
    }
}
