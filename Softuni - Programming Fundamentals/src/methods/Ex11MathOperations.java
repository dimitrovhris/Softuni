package methods;

import java.util.Scanner;

public class Ex11MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        char operator = sc.nextLine().charAt(0);
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.printf("%.0f", (calculate(num1, operator, num2)));
    }
    public static double calculate(int num1, char char1, int num2){
        int sum = 0;
        switch(char1){
            case '+':
                sum = num1 + num2;
                break;
            case '-':
                sum = num1 - num2;
                break;
            case '*':
                sum = num1 * num2;
                break;
            case '/':
                sum = num1 / num2;
        }
        return sum;
    }
}
