package loopsEx;
import java.util.Scanner;
public class LoopsEx2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int n = Integer.parseInt(readData.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(readData.nextLine());
            sum = sum + number;
            if (number > max){
                max = number;
            }
        }
        int sumWithoutTheMaxNumber = sum - max;
        if (sumWithoutTheMaxNumber == max){
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }
        else{
            int diff = Math.abs(max - sumWithoutTheMaxNumber);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
