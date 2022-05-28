package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());

        for(int i = 1000; i <= 9999; i++){
            String stringNum = "" + i;
            int digit1 =Integer.parseInt("" + stringNum.charAt(0));
            int digit2 =Integer.parseInt("" + stringNum.charAt(1));
            int digit3 =Integer.parseInt("" + stringNum.charAt(2));
            int digit4 =Integer.parseInt("" + stringNum.charAt(3));
            if(digit1 <= end && digit1 >= begin && digit2 <= end && digit2 >= begin && digit3 <= end && digit3 >= begin && digit4 <= end && digit4 >= begin)
            if(digit1 % 2 == 0){
                if(digit4 % 2 != 0){
                    if(digit1 > digit4){
                        if((digit2 + digit3) % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }
                }
            }
            else{
                if(digit4 % 2 == 0){
                    if(digit1 > digit4){
                        if((digit2 + digit3) % 2 == 0){
                            System.out.print(i + " ");
                        }
                    }
                }
            }
        }
    }
}
