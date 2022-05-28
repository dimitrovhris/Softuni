package loops;
import java.util.Scanner;
public class Loop7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);

        int numbersCount = Integer.parseInt(readData.nextLine());
        int sum = 0;


        for (int i = 1; i <= numbersCount; i++){
            int number = Integer.parseInt(readData.nextLine());
            sum = number + sum;

        }
        System.out.println(sum);
    }
}
