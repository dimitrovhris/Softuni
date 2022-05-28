package nestedConditionalEx;

import java.util.Scanner;

public class NestedEx7 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int number1 = Integer.parseInt(readData.nextLine());
        int number2 = Integer.parseInt(readData.nextLine());
        String symbol = readData.nextLine();

        double result = 0;
        String evenOdd = "";
        boolean canDivide = true;

        switch (symbol) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
            case "%":
                canDivide = (number2 != 0);
                if (canDivide) {
                    switch (symbol) {
                        case "/":
                            result = 1.0 * number1 / number2;

                            System.out.printf("%d %s %d = %.2f", number1, symbol, number2, result);
                        break;
                        case "%":
                            result = 1.0 * number1 % number2;

                            System.out.printf("%d %s %d = %.0f", number1, symbol, number2, result);
                        break;
                    }
                } else {
                    System.out.printf("Cannot divide %d by zero", number1);
                }
            break;
        }
        switch (symbol) {
            case "+":
            case"-":
            case "*":
                if (result % 2 == 0)
                    evenOdd = "even";
                else
                    evenOdd = "odd";
                System.out.printf("%d %s %d = %.0f - %s", number1, symbol, number2, result, evenOdd);
                break;

        }
    }
}

