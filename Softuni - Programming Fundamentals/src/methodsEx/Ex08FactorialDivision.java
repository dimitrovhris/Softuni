package methodsEx;

import java.util.Scanner;

public class Ex08FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum1 = Integer.parseInt(sc.nextLine());
        int inputNum2 = Integer.parseInt(sc.nextLine());
        System.out.printf("%.2f",calculateFactorial(inputNum1)/ calculateFactorial(inputNum2));
    }
    public static double calculateFactorial(int num){
        double result = 1;
        for(int i = num; i >= 1; i--){
            result *= i;
        }
        return result;
    }
}
