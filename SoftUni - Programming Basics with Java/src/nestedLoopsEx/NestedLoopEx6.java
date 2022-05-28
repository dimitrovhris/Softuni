package nestedLoopsEx;

import java.util.Scanner;

public class NestedLoopEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        //i - current number
        for (int i = 1111; i <= 9999; i++){
            int counter = 0;
            String currentNum = "" + i;
            for(int j = 0; j < 4; j++){
                int divider = Integer.parseInt("" + currentNum.charAt(j));
                if(divider != 0){
                        if(n % divider == 0){
                    counter++;
                }
            }
            }
            if(counter == 4){
                System.out.printf("%d ", i);
            }
        }
    }
}
