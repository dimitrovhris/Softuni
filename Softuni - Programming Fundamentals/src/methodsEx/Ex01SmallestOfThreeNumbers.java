package methodsEx;

import java.util.Scanner;

public class Ex01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        System.out.println(printTheSmallestOfThreeNumbers(a, b ,c));
    }
    public static int printTheSmallestOfThreeNumbers(int num1, int num2, int num3){
        int smallestOfFirstTwo = printTheSmallestOfFirstTwoNumbers(num1, num2);
        return Math.min(smallestOfFirstTwo, num3);
    }
    public static int printTheSmallestOfFirstTwoNumbers(int num1, int num2){
        return Math.min(num1, num2);
    }
}
