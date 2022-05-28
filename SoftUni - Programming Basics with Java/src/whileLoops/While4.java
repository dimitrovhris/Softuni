package whileLoops;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        while(k <=n ){
            System.out.println(k);
            k = 2 * k + 1;
        }
    }
}
