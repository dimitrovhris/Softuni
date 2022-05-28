package loops;
import java.util.Scanner;
public class Loop4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int n = Integer.parseInt(readData.nextLine());

        for (int i = 0; i <= n; i = i + 2){
            System.out.printf("%.0f\n",Math.pow(2, i));
        }
    }
}
