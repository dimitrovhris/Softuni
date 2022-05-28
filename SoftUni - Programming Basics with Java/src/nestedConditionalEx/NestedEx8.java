package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx8 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        String month = readData.nextLine();
        int nightsCount = Integer.parseInt(readData.nextLine());

        double apartmentPrice = 0.00;
        double studioPrice = 0.00;
        double discount = 0.00;

        switch(month){
            case "May":
                case "October":
                apartmentPrice = nightsCount * 65;
                studioPrice = nightsCount * 50;
                if (nightsCount > 7 && nightsCount <= 14){
                    studioPrice = studioPrice - 0.05 * studioPrice;
                }else if(nightsCount > 14){
                    studioPrice = studioPrice - 0.30 * studioPrice;
                }
                break;
            case "June":
            case "September":
                apartmentPrice = nightsCount * 68.70;
                studioPrice = nightsCount * 75.20;
                if (nightsCount > 14){
                    studioPrice = studioPrice - 0.20 * studioPrice;
                }
                break;
            case "July":
            case "August":
                apartmentPrice = nightsCount * 77.00;
                studioPrice = nightsCount * 76.00;
                break;
            }


            if (nightsCount > 14){
                apartmentPrice = apartmentPrice - 0.10 * apartmentPrice;
            }
            System.out.printf("Apartment: %.2f lv.\n", apartmentPrice);
            System.out.printf("Studio: %.2f lv.", studioPrice);


        }
    }
