package conditionalStatementsEx;
import java.util.Scanner;
public class MoreConditional1 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
            double volume = Double.parseDouble(readData.nextLine());
            int debit1 = Integer.parseInt(readData.nextLine());
            int debit2 = Integer.parseInt(readData.nextLine());
            double hours = Double.parseDouble(readData.nextLine());

            double pipe1In = debit1* hours;
            double pipe2In = debit2 * hours;

            double totalWater = pipe1In + pipe2In;

            double percentPoolIn = (pipe1In + pipe2In) / volume * 100;
            double percentPipe1 = pipe1In * 100 / totalWater;
            double percentPipe2 = pipe2In * 100 / totalWater;


            if ((pipe1In + pipe2In) <= volume){
                System.out.printf("The pool is %.2f full. Pipe 1: %.2f%% Pipe 2: %.2f%%", percentPoolIn, percentPipe1,percentPipe2);
            }
            else {
                double moreLiters = (pipe1In + pipe2In) - volume;
                System.out.printf("For %.2f. hours the pool overflows with %.2f liters.", hours, moreLiters);
            }




    }
}
