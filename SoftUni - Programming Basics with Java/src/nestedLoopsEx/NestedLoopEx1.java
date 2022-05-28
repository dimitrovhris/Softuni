package nestedLoopsEx;

import java.util.Scanner;

public class NestedLoopEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int current = 1;
        boolean flag = false;
        for(int rows = 1; rows <= n; rows++){
            for(int cols = 1; cols <= rows; cols++){
                if(current > n){
                    flag = true;
                    break;
                }
                System.out.print(current + " ");
                current++;
            }
            if(flag){
                break;
            }
            System.out.println();
        }
    }
}
