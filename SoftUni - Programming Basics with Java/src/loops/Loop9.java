package loops;
import java.util.Scanner;
public class Loop9 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        int n2 = Integer.parseInt(readData.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i <= n2; i++){
            int number1 = Integer.parseInt(readData.nextLine());
            sum1 = sum1 + number1;
        }
        for (int i = 1; i <= n2; i++){
            int number2 = Integer.parseInt(readData.nextLine());
            sum2 = sum2 + number2;
        }
        if (sum1 == sum2){
            System.out.printf("Yes, sum = %d", sum1);
        }else {
            int difference = Math.abs(sum1- sum2);
            System.out.printf("No, diff = %d", difference);
        }
    }
}