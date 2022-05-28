package conditionalStatementsEx;
import java.util.Scanner;
public class ConditionalEx2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int number = readData.nextInt();
        double newNumber = 0.00;
        double bonusScore = 0;
        if (number <= 100){
            bonusScore =  5;
        }
        else if ( number <= 1000){
            bonusScore =  0.20 * number;
        }
        else {
            bonusScore =  0.10 * number;
        }

        if (number % 2 == 0){
                bonusScore += 1;
        }
        else if (number % 10 == 5){
                bonusScore += 2;
        }

        double points = number + bonusScore;
        System.out.println(bonusScore);
        System.out.println(points);


    }
}
