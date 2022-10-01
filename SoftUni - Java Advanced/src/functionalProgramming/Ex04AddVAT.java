package functionalProgramming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class Ex04AddVAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] prices = Arrays.stream(sc.nextLine().split(", "))
                .mapToDouble(Double::parseDouble)
                .toArray();
        UnaryOperator<Double> addVAT = price -> price* 1.20;
        System.out.println("Prices with VAT:");
        for(double price: prices){
            System.out.printf("%.2f%n", addVAT.apply(price));
        }
    }
}
