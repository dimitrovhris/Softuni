package basicSynatx;

import java.util.Scanner;

public class Basic4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initHour = Integer.parseInt(sc.nextLine());
        int initMinute = Integer.parseInt(sc.nextLine());

        int totalMinutes = initHour * 60 + initMinute + 30;

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        if(hours == 24)
            hours = 0;

        System.out.printf("%d:%02d", hours, minutes);
    }
}
