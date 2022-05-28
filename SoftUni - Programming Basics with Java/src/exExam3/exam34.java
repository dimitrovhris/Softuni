package exExam3;

import java.util.Scanner;

public class exam34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int groupsCount = Integer.parseInt(sc.nextLine());
        int musalaPeople = 0;
        int monblanPeople = 0;
        int kilimanjaroPeople = 0;
        int k2People = 0;
        int everestPeople = 0;
        int totalPeople = 0;
        for(int i = 1; i <= groupsCount; i++){
            int peopleInGroup = Integer.parseInt(sc.nextLine());
            if(peopleInGroup <= 5){
                musalaPeople += peopleInGroup;
            }
            else if(peopleInGroup <= 12){
                monblanPeople += peopleInGroup;
            }
            else if(peopleInGroup <= 25){
                kilimanjaroPeople += peopleInGroup;
            }
            else if(peopleInGroup <= 40){
                k2People += peopleInGroup;
            }
            else{
                everestPeople += peopleInGroup;
            }
            totalPeople += peopleInGroup;
        }
        double musalaPercent = 1.0 * musalaPeople / totalPeople * 100;
        double monblanPercent = 1.0 * monblanPeople / totalPeople * 100;
        double kilimanjaroPercent = 1.0 * kilimanjaroPeople / totalPeople * 100;
        double k2Percent = 1.0 * k2People / totalPeople * 100;
        double everestPercent = 1.0 * everestPeople / totalPeople * 100;

        System.out.printf("%.2f%%%n", musalaPercent);
        System.out.printf("%.2f%%%n", monblanPercent);
        System.out.printf("%.2f%%%n", kilimanjaroPercent);
        System.out.printf("%.2f%%%n", k2Percent);
        System.out.printf("%.2f%%", everestPercent);
    }
}
