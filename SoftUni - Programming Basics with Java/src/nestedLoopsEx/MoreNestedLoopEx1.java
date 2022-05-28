package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int upLimit1 = Integer.parseInt(sc.nextLine());
        int upLimit2 = Integer.parseInt(sc.nextLine());
        int upLimit3 = Integer.parseInt(sc.nextLine());

        for(int i = 2; i <= upLimit1; i++){
            boolean firstEven = false;
            if(i % 2 == 0){
                firstEven = true;
            }
            for(int j = 2; j <= upLimit2; j++){
                int count2 = 0;
                for(int divider = 1; divider <= j; divider++){
                    if(j % divider == 0){
                        count2++;
                    }
                }
                for(int k = 2; k <= upLimit3; k++){
                    boolean thirdEven = false;
                    if(k % 2 == 0){
                        thirdEven = true;
                    }
                    if(count2 < 3 && thirdEven && firstEven)
                    System.out.printf("%d% d %d%n", i, j, k);
                }
            }
        }
    }
}
