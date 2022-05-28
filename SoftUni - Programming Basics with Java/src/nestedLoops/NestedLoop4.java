package nestedLoops;

import java.util.Scanner;

public class NestedLoop4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startNumber = Integer.parseInt(sc.nextLine());
        int endNumber = Integer.parseInt(sc.nextLine());
        int magicNumber = Integer.parseInt(sc.nextLine());

        int combination = 0;
        boolean flag = false;

        for(int x = startNumber; x <= endNumber; x++){
            for(int y = startNumber; y<= endNumber; y++){
                int sum = x + y;
                combination++;
                if(sum == magicNumber){
                    System.out.printf("Combination N:%d (%d + %d = %d)", combination, x, y, magicNumber);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        if(!flag){
            System.out.printf("%d combinations - neither equals %d", combination, magicNumber);
        }
    }
}
