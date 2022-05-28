package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1000; i <= 9999; i++){
            boolean zero = false;
            int sum12 = 0;
            int sum34 = 0;
            String stringNum = "" + i;
            for(int j = 0; j < 2; j++){
                int currentNum12 = Integer.parseInt("" + stringNum.charAt(j));
                if(currentNum12 == 0){
                    zero = true;
                    break;
                }
                sum12 += currentNum12;
            }
            for(int k = 2; k < 4; k++){
                if(zero){
                    break;
                }
                int currentNum34 = Integer.parseInt("" + stringNum.charAt(k));
                if(currentNum34 == 0){
                    zero = true;
                    break;
                }
                sum34 += currentNum34;
            }
            if(!zero && sum12 == sum34 && n % sum12 == 0){
                System.out.printf("%d ", i);
            }
        }
    }
}
