package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double moneyGeorge = Double.parseDouble(sc.nextLine());
        int students = Integer.parseInt(sc.nextLine());
        double lightsabersPrice = Double.parseDouble(sc.nextLine());
        double robesPrice = Double.parseDouble(sc.nextLine());
        double beltPrice = Double.parseDouble(sc.nextLine());

        double totalLightsabers = lightsabersPrice * Math.ceil((students + 0.1 * students));
        double totalRobes = robesPrice * students;
        int freeBelts = students / 6;
        double totalBelts = beltPrice * (students - freeBelts);

        double totalSum = totalLightsabers + totalRobes + totalBelts;
        double diff = totalSum - moneyGeorge;
        if(moneyGeorge >= totalSum){
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        }
        else{
            System.out.printf("George Lucas will need %.2flv more.", diff);
        }
    }
}
