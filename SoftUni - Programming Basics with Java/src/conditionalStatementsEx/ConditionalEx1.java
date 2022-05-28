package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int seconds1 = readData.nextInt();
        int seconds2 = readData.nextInt();
        int seconds3 = readData.nextInt();

        int sumSeconds = seconds1 + seconds2 + seconds3;

        int minutes = sumSeconds / 60;
        int seconds = sumSeconds % 60;

        if (seconds >= 0 & seconds <=9){
            System.out.printf("%d:0%d",minutes, seconds);
        }
        else{
            System.out.printf("%d:%d",minutes, seconds);
        }

    }
}
