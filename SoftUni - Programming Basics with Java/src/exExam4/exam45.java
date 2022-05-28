package exExam4;

import java.util.Scanner;

public class exam45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int paintedEggs = Integer.parseInt(sc.nextLine());
        int redEggs = 0;
        int orangeEggs = 0;
        int blueEggs = 0;
        int greenEggs = 0;
        String maxColor = "";
        int maxNow = Integer.MIN_VALUE;
        for(int i = 1; i <= paintedEggs; i++){
            String eggNow = sc.nextLine();
            switch(eggNow) {
                case "red":
                    redEggs++;
                    if (redEggs > maxNow) {
                        maxNow = redEggs;
                        maxColor = eggNow;
                    }
                    break;
                case "orange":
                    orangeEggs++;
                    if (orangeEggs > maxNow) {
                        maxNow = orangeEggs;
                        maxColor = eggNow;
                    }
                    break;
                case "blue":
                    blueEggs++;
                    if (blueEggs > maxNow) {
                        maxNow = blueEggs;
                        maxColor = eggNow;
                    }
                    break;
                case "green":
                    greenEggs++;
                    if (greenEggs > maxNow) {
                        maxNow = greenEggs;
                        maxColor = eggNow;
                    }
                    break;
            }
        }
        System.out.printf("Red eggs: %d%n", redEggs);
        System.out.printf("Orange eggs: %d%n", orangeEggs);
        System.out.printf("Blue eggs: %d%n", blueEggs);
        System.out.printf("Green eggs: %d%n", greenEggs);
        System.out.printf("Max eggs: %d -> %s", maxNow, maxColor);
    }
}
