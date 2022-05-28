package exExam8and9;

import java.util.Scanner;

public class exam86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = Integer.parseInt(sc.nextLine());
        int a2 = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        for(char i = (char)a1; i <= a2 - 1; i++){
            for(int j = 1; j <= n - 1; j++){
                for(int k = 1; k <= n / 2 - 1; k++){
                    int l = i;
                    if((int) i % 2 == 1 && (j + k + l) % 2 == 1)
                    System.out.printf("%c-%d%d%d%n", i, j, k, l);
                }
            }
        }
    }
}
