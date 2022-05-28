package nestedConditionalEx;
import java.util.Scanner;
public class NestedEx10 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        String yearType = readData.nextLine();
        int holidays = Integer.parseInt(readData.nextLine());
        int townWeekends = Integer.parseInt(readData.nextLine());

        double sofiaWeekends = 48 - townWeekends;
        double sofiaGames = sofiaWeekends * 3/4 + holidays * 2/3;
        double townGames = townWeekends;
        double totalGames = sofiaGames + townGames;

        if (yearType.equals("leap")){
            totalGames = Math.floor(totalGames + 0.15 * totalGames);
            System.out.println((int)totalGames);
        }
        else{
            System.out.println((int)(Math.floor(totalGames)));
        }
    }
}
