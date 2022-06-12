package methodsEx;

import java.util.Scanner;

public class Ex05AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input1 = Integer.parseInt(sc.nextLine());
        int input2 = Integer.parseInt(sc.nextLine());
        int input3 = Integer.parseInt(sc.nextLine());
        System.out.println(totalSum(addFirstTwo(input1,input2), input3));
    }
    public static int totalSum (int num1, int num2){
        return num1 - num2;
    }
    public static int addFirstTwo(int num1, int num2){
        return num1 + num2;
    }
}
