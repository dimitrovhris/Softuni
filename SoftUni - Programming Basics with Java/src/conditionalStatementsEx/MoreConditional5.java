package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int hoursNeed = Integer.parseInt(readData.nextLine());
        int days = Integer.parseInt(readData.nextLine());
        int brakingWorkers = Integer.parseInt(readData.nextLine());

        double workingHours = (days - (0.10 * days)) * 8;
        double brakingHours = brakingWorkers * (2 * days);

        double totalHours = Math.floor(workingHours + brakingHours);

        if(totalHours < hoursNeed){
            double hoursNeeded = hoursNeed - totalHours;
            System.out.printf("Not enough time!%.0f hours needed.",hoursNeeded );
        }
        else{
            double hoursLeft = totalHours - hoursNeed;
            System.out.printf("Yes!%.0f hours left.",hoursLeft);
        }

    }
}
