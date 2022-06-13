package methodsEx;

import java.util.Scanner;

public class Ex10TopNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= inputNum; i++){
            if(checkIfTheNumberIsTop(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean checkIfTheNumberIsTop(int num) {
        int sumOfDigits = 0;
        boolean sumDivisibleBy8 = false;
        boolean oddDigit = false;
        for (int j = 0; j <= ("" + num).length()-1; j++) {
            int currentDigit = Integer.parseInt("" + ("" + num).charAt(j));
            sumOfDigits += currentDigit;
            if(currentDigit % 2 == 1){
                oddDigit = true;
            }
        }
        if(sumOfDigits % 8 == 0){
            sumDivisibleBy8 = true;
        }
        return sumDivisibleBy8 && oddDigit;
    }
}
