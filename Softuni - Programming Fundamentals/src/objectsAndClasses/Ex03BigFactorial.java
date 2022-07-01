package objectsAndClasses;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Ex03BigFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        BigInteger num = new BigInteger(String.valueOf(1));
        for(int i = n; i >= 1; i--){
            num = num.multiply(BigInteger.valueOf(i));
        }
        System.out.println(num);
    }
}
