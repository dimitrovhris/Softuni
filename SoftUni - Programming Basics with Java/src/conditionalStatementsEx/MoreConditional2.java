package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int lazyDays = Integer.parseInt(readData.nextLine());

        int workDays = 365 - lazyDays;

        int minutes = lazyDays * 127 + workDays * 63;

        if (minutes < 30000){
            int minutesLess = 30000 - minutes;
            int newHoursLess = minutesLess / 60;
            int newMinutesLess = minutesLess % 60;
            System.out.print("Tom sleeps well\n");
            System.out.printf("%d hours and %d minutes less for play", newHoursLess, newMinutesLess);
        }
        else{
            int moreMinutes = minutes - 30000;
            int newMoreHours = moreMinutes / 60;
            int newMoreMinutes = moreMinutes % 60;
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", newMoreHours, newMoreMinutes);
        }
    }
}
