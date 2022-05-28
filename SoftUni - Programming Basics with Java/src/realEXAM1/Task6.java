package realEXAM1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        int digit1 = Integer.parseInt("" + number.charAt(2));
        int digit2 = Integer.parseInt("" + number.charAt(1));
        int digit3 = Integer.parseInt("" + number.charAt(0));

        for(int i = 1; i <= digit1; i++){
            for(int j = 1; j <= digit2; j++){
                for(int k = 1; k <= digit3; k++){
                    int sum = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, sum);
                }
            }
        }
    }
}
