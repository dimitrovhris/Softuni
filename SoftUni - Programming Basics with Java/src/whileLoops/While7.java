package whileLoops;

import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int min = Integer.MAX_VALUE;
        while(!input.equals("Stop")){
            int inputNumber = Integer.parseInt(input);
            if(inputNumber < min){
                min = inputNumber;
            }
            input = sc.nextLine();
        }
        System.out.println(min);
    }
}
