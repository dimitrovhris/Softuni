package methods;

import java.util.Scanner;

public class Ex01SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        printSignOfANumber(num);
    }
    public static void printSignOfANumber(int num){
        String sign;
        if(num > 0){
            sign = "positive";
        }
        else if(num < 0){
            sign = "negative";
        }
        else{
            sign = "zero";
        }
        System.out.printf("The number %d is %s.", num, sign);
    }
}
