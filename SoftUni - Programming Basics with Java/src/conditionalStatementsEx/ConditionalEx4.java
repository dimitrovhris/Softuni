package conditionalStatementsEx;

import java.util.Scanner;

public class ConditionalEx4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        double value = readData.nextDouble();
        String inputNumber = readData.nextLine();
        String outputNumber = readData.nextLine();
        
        double temp = 0.00;

        if ("mm".equals(inputNumber)){
            temp = value / 1000;
        }
        else if ("cm".equals(inputNumber)){
            temp = value/100;
        }

        if ("mm".equals(outputNumber)){
            temp = value * 1000;
        }
        else if("cm".equals(outputNumber)){
            temp = value * 100;
        }
        System.out.printf("%.3f", temp);
    }
}
