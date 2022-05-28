package exExam3;

import java.util.Scanner;

public class exam32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double recordNow = Double.parseDouble(sc.nextLine());
        double distance = Double.parseDouble(sc.nextLine());
        double metersForSecond = Double.parseDouble(sc.nextLine());

        double secondsDelay = Math.floor(distance / 50) * 30;

        double totalSeconds = distance * metersForSecond + secondsDelay;

        if(totalSeconds < recordNow){
            System.out.printf("Yes! The new record is %.2f seconds.", totalSeconds);
        }
        else{
            double moreSeconds = Math.abs(recordNow - totalSeconds);
            System.out.printf("No! He was %.2f seconds slower.", moreSeconds);
        }
    }
}
