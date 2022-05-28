package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = Integer.parseInt(sc.nextLine());
        double headsetPrice = Double.parseDouble(sc.nextLine());
        double mousePrice = Double.parseDouble(sc.nextLine());
        double keyboardPrice = Double.parseDouble(sc.nextLine());
        double displayPrice = Double.parseDouble(sc.nextLine());
        double sumTrashed = 0;
        for (int i = 1; i <= lostGames; i++) {
            if(i % 2 == 0){
                sumTrashed += headsetPrice;
            }
            if(i % 3 == 0){
                sumTrashed += mousePrice;
            }
            if(i % 6 == 0){
                sumTrashed += keyboardPrice;
            }
            if(i % 12 == 0){
                sumTrashed += displayPrice;
            }
        }
        System.out.printf("Rage expenses: %.2f lv.", sumTrashed);
    }
}
