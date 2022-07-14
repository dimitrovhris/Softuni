package textProcessingEx;

import java.math.BigInteger;
import java.util.Scanner;

public class Ex05MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bigNum = sc.nextLine();
        int digit = Integer.parseInt(sc.nextLine());
        BigInteger num1 = new BigInteger(bigNum);
        BigInteger num2 = BigInteger.valueOf(digit);
        BigInteger end = num1.multiply(num2);
        System.out.println(end);

    }
}
