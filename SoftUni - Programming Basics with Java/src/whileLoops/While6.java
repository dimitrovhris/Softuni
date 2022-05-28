package whileLoops;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int max = Integer.MIN_VALUE;
        while(!input.equals("Stop")){
            int inputNumber = Integer.parseInt(input);
            if (inputNumber > max){
                max = inputNumber;
            }
            input = sc.nextLine();
        }
        System.out.println(max);

    }
}
