package whileLoopsEx;

import java.util.Scanner;

public class WhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "";
        int stepsSum = 0;
        int steps;

        while (!input.equals("Going home") && stepsSum < 10000){
            input = sc.nextLine();
            if(input.equals("Going home")){
                steps = sc.nextInt();
            }
            else{
                steps = Integer.parseInt(input);
            }
            stepsSum += steps;
        }
        int diff = Math.abs(stepsSum - 10000);
        if(stepsSum >= 10000){
            System.out.println("Goal reached! Good job!\n" + diff + " steps over the goal.");
        }
        else{
            System.out.println(diff + " more steps to reach the goal!");
        }
    }
}
