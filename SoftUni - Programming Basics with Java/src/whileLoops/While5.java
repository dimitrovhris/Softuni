package whileLoops;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double increase;
        double sum = 0;
        while(!input.equals("NoMoreMoney")){
            increase = Double.parseDouble(input);
            if(increase >= 0){
            sum = sum + increase;
            System.out.printf("Increase: %.2f%n", increase);
                input = sc.nextLine();
            }
            else{
                System.out.println("Invalid operation");
                input = "NoMoreMoney";
            }


        }
        System.out.printf("Total: " + "%.2f", sum);
    }
}
