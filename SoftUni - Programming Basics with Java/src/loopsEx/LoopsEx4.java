package loopsEx;

import java.util.Scanner;

public class LoopsEx4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int n = Integer.parseInt(readData.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;

        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;

        for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(readData.nextLine());
            if (number < 200) {
                n1++;
                p1 = n1 / n * 100;
            } else if (number <= 399) {
                n2++;
                p2 = n2 / n * 100;
            } else if (number <= 599) {
                n3++;
                p3 = n3 / n * 100;
            } else if (number <= 799){
                n4++;
                p4 = n4 / n * 100;
            }else{
                n5++;
                p5 = n5 / n * 100;
            }
        }
        System.out.printf("%.2f%%\n",p1);
        System.out.printf("%.2f%%\n",p2);
        System.out.printf("%.2f%%\n",p3);
        System.out.printf("%.2f%%\n",p4);
        System.out.printf("%.2f%%\n",p5);
    }
}
