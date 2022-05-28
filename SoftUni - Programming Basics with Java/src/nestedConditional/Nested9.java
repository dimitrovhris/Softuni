package nestedConditional;
import java.util.Scanner;
public class Nested9 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        String town = readData.nextLine();
        double sales = Double.parseDouble(readData.nextLine());

        double commission = 0.00;

        if (sales >= 0 && sales <= 500){
            switch (town){
                case "Sofia":
                    commission = 0.05 * sales;
                    break;
                case "Varna":
                    commission = 0.045 * sales;
                    break;
                case "Plovdiv":
                    commission = 0.055 * sales;
                    break;
            }
        }else if (sales > 500 && sales <= 1000){
            switch (town){
                case "Sofia":
                    commission = 0.07 * sales;
                    break;
                case "Varna":
                    commission = 0.075 * sales;
                    break;
                case "Plovdiv":
                    commission = 0.08 * sales;
                    break;
            }
        }
        else if (sales > 1000 && sales <= 10000 ){
            switch (town){
                case "Sofia":
                    commission = 0.08 * sales;
                    break;
                case "Varna":
                    commission = 0.10 * sales;
                    break;
                case "Plovdiv":
                    commission = 0.12 * sales;
                    break;
            }
        }else if (sales > 10000){ //Влиза тук 1500
            switch (town){
                case "Sofia":
                    commission = 0.12 * sales;
                    break;
                case "Varna":
                    commission = 0.13 * sales;
                    break;
                case "Plovdiv":
                    commission = 0.145 * sales;
                    break;
            }
        }
        if (town.equals("Sofia") || town.equals("Varna") || town.equals("Plovdiv")){
            if (sales < 0){
                System.out.println("error");
            }
            else {
                System.out.printf("%.2f", commission);
            }
        }else{
            System.out.println("error");
        }


    }
}
