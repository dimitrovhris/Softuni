package nestedLoops;

import java.util.Scanner;

public class NestedLoop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double income = 0;
        while(!input.equals("End")){
            double sumNeed = Double.parseDouble(sc.nextLine());
            for(double sum = 0; sum <= sumNeed; sum+= income){
                income = Double.parseDouble(sc.nextLine());
            }
            System.out.printf("Going to %s!%n", input);
            input = sc.nextLine();
        }
    }
}
