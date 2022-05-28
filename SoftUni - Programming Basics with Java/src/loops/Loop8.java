package loops;
import java.util.Scanner;
public class Loop8 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int numbersCount = Integer.parseInt(readData.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        for (int i = 1; i <= numbersCount; i++){
            int number = Integer.parseInt(readData.nextLine());
            if (number > max){
                max = number;
            }
            if (number < min){
                min = number;
            }
        }
        System.out.printf("Max number: %d\n", max);
        System.out.printf("Min number: %d", min);
    }
}
