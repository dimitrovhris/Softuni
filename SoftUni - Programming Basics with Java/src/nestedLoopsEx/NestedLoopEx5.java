package nestedLoopsEx;

import java.util.Scanner;

public class NestedLoopEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int ll = Integer.parseInt(sc.nextLine());

        for(int i = 1; i < n; i++){
            for(int j = 1; j < n; j++){
                for(int k = 97; k <= ll+96; k++){
                    char thirdSymbol = (char) k;
                    for(int l = 97; l <= ll+96; l++){
                        char fourthSymbol = (char) l;
                        for(int m = 2; m <= n; m++){
                            if(m > j &&  m > i)
                            System.out.printf("%d%d%c%c%d ", i, j, thirdSymbol, fourthSymbol, m);
                        }
                    }
                }
            }
        }
    }
}
