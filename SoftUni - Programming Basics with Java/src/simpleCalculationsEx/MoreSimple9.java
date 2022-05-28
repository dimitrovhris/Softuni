package simpleCalculationsEx;
import java.util.Scanner;
public class MoreSimple9 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        String weather = readData.nextLine();

        if (weather.equals("sunny")){
            System.out.println("It's warm outside!");
        }
        else if (weather.equals("cloudy")){
            System.out.println("It's cold outside!");
        }
        else if (weather.equals("snowy")){
            System.out.println("It's cold outside!");
        }


    }
}
