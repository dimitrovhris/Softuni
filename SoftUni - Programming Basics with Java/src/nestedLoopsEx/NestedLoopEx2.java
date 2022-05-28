package nestedLoopsEx;

import java.util.Scanner;

public class NestedLoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());

        for(int i = num1; i <= num2; i++){
            String currentNum = "" + i;
            int sumOdd = 0;
            int sumEven = 0;
            for(int j = 0; j < currentNum.length(); j++){
                int currentDigit = Integer.parseInt("" + currentNum.charAt(j));
                if(j % 2 == 0){
                    sumEven+=currentDigit;
                }
                else{
                    sumOdd+=currentDigit;
                }
            }
            if(sumOdd == sumEven){
                System.out.print(i + " ");
            }
        }
    }
}
