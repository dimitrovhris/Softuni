package exExam1;

import java.util.Scanner;

public class exam14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int points = 0;
        int redBalls = 0;
        int orangeBalls = 0;
        int yellowBalls = 0;
        int whiteBalls = 0;
        int blackBalls = 0;
        int otherBalls = 0;
        for (int i = 1; i <= n; i++){
            String ballType = sc.nextLine();
            switch (ballType){
                case "red": points+= 5; redBalls++;
                break;
                case "orange": points += 10; orangeBalls++;
                break;
                case "yellow": points += 15; yellowBalls++;
                break;
                case "white": points += 20; whiteBalls++;
                break;
                case "black": points = points / 2; blackBalls++;
                break;
                default:
                    otherBalls++;
            }
        }
        System.out.printf("Total points: %d%n", points);
        System.out.printf("Red balls: %d%n", redBalls);
        System.out.printf("Orange balls: %d%n", orangeBalls);
        System.out.printf("Yellow balls: %d%n", yellowBalls);
        System.out.printf("White balls: %d%n", whiteBalls);
        System.out.printf("Other colors picked: %d%n", otherBalls);
        System.out.printf("Divides from black balls: %d", blackBalls);
    }
}
