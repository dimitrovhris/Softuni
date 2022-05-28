package loopsEx;
import java.util.Scanner;
public class LoopsEx5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int n = Integer.parseInt(readData.nextLine());

        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;

        for (int i = 1; i <= n; i++){
            int number = Integer.parseInt(readData.nextLine());
            if (number % 2 == 0){
                n2++;
                p2 = n2/n * 100;
            }
            if (number % 3 == 0){
                n3++;
                p3 = n3/n * 100;
            }
            if (number % 4 == 0){
                n4++;
                p4 = n4/n * 100;
            }
        }
        System.out.printf("%.2f%%%n", p2);
        System.out.printf("%.2f%%%n", p3);
        System.out.printf("%.2f%%%n", p4);

    }
}
