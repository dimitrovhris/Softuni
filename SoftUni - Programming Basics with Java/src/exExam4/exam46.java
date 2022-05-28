package exExam4;

import java.util.Scanner;

public class exam46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int breads = Integer.parseInt(sc.nextLine());
        int maxNow = Integer.MIN_VALUE;
        String bestChef = "";

        for(int i = 1; i <= breads; i++){
            boolean newBest = false;
            String chef = sc.nextLine();
            int totalSum = 0;
            String input = sc.nextLine();
            while(!input.equals("Stop")){
                int gradeNow = Integer.parseInt(input);
                    totalSum+= gradeNow;
                    if(totalSum > maxNow){
                        bestChef = chef;
                        maxNow = totalSum;
                        newBest = true;
                    }
                    input = sc.nextLine();
            }
            System.out.printf("%s has %d points.%n", chef, totalSum);
            if(newBest)
                System.out.printf("%s is the new number 1!%n", chef);
        }
        System.out.printf("%s won competition with %d points!", bestChef, maxNow);
    }
}

