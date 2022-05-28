package dataTypesEx;

import java.util.Scanner;

public class Ex02SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String num = Integer.toString(n);
        int sum = 0;
        for(int i = 0; i <= num.length()-1; i++){
            int currentDigit = Integer.parseInt(""+ num.charAt(i));
            sum += currentDigit;
        }
        System.out.println(sum);
    }
}
