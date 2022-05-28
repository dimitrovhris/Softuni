package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int men = Integer.parseInt(sc.nextLine());
        int women = Integer.parseInt(sc.nextLine());
        int freeTables = Integer.parseInt(sc.nextLine());

        int usedTables = 0;
        boolean flag = false;

        for(int i = 1; i <= men; i++){
            for(int j = 1; j <= women; j++){
                System.out.printf("(%d <-> %d) ", i, j);
                usedTables++;
                if (usedTables == freeTables){
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
    }
}
