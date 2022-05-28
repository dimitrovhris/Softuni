package exExam6;

import java.util.Scanner;

public class exam66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int heightNeed = Integer.parseInt(sc.nextLine());
        int heightNow = heightNeed - 30;
        int jumps = 0;
        while(heightNow <= heightNeed){
            int fails = 0;
            while(fails < 3){
                int jumpNow = Integer.parseInt(sc.nextLine());
                jumps++;
                if(jumpNow > heightNow){
                    heightNow += 5;
                    break;
                }
                else{
                    fails++;
                }
            }
            if(fails == 3){
                break;
            }
        }
        if(heightNow <= heightNeed){
            System.out.printf("Tihomir failed at %dcm after %d jumps.", heightNow, jumps);
        }
        else{
            System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", heightNeed, jumps);
        }
    }
}

