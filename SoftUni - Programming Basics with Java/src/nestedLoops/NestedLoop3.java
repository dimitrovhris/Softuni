package nestedLoops;

import java.util.Scanner;

public class NestedLoop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int combinations = 0;
        for(int x = 0; x <= n; x++){
            for(int y = 0; y <= n; y++){
                for(int z = 0; z <= n; z++){
                    int result = x + y + z;
                    if(result == n){
                        combinations++;
                    }
                }
            }
        }
        System.out.println(combinations);
    }
}
