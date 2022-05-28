package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();
        int episodeLast = Integer.parseInt(sc.nextLine());
        int breakLast = Integer.parseInt(sc.nextLine());

        double lunchTime = 1.0 * breakLast / 8;
        double restTime = 1.0 * breakLast / 4;

        double timeRemain = breakLast - (lunchTime + restTime);
        double minutesUpDown = Math.ceil(Math.abs(timeRemain - episodeLast));

        if(timeRemain >= episodeLast){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, minutesUpDown);
        }
        else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, minutesUpDown);
        }
    }
}
