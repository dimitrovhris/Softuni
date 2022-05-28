package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int hoursInput = Integer.parseInt(readData.nextLine());
        int minutesInput = Integer.parseInt(readData.nextLine());
        int newHours = 0;
        int newMinutes = 0;
        if (minutesInput <= 44){
            newHours = hoursInput;
            newMinutes = minutesInput + 15;
        }
        else{
            newHours = hoursInput + 1;
            newMinutes = minutesInput+15-60;
        }
        if (newHours >= 24){
            newHours = 0;
        }
        if (newMinutes > 9){
            System.out.printf("%d:%d",newHours, newMinutes);
        }
        else{
            System.out.printf("%d:0%d", newHours, newMinutes);
        }

    }

}
