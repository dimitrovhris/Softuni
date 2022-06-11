package methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex08MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());
        int power = Integer.parseInt(sc.nextLine());
        DecimalFormat dec = new DecimalFormat("0.####");
        System.out.println(dec.format(mathPower(num, power)));


    }
    public static double mathPower (double number, int power){
        double sum = 1;
        for(int i = 1; i <= power; i++){
            sum *= number;
        }
        return sum;
    }
}
