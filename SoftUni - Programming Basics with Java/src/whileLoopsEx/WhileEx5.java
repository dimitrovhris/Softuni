package whileLoopsEx;

import java.util.Scanner;

public class WhileEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inputChange = Double.parseDouble(sc.nextLine());
        double change = inputChange * 100;
        double partChange = change;
        double divide = 200;
        int coins;
        int totalCoins = 0;
        while(partChange > 0){
            coins = (int)Math.floor(partChange / divide);
            totalCoins += coins;
            partChange = Math.floor(partChange % divide);
            if (divide == 200){
                divide -= 100;
            }
            else if(divide == 100){
                divide -= 50;
            }
            else if(divide == 50)
                divide -= 30;
            else if(divide == 20){
                divide -= 10;
            }
            else if (divide == 10){
                divide -= 5;
            }
            else if (divide == 5){
                divide -= 3;
            }
            else if (divide == 2){
                divide -= 1;
            }
        }
        System.out.println(totalCoins);
    }
}
