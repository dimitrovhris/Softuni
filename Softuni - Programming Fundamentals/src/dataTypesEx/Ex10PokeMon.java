package dataTypesEx;

import java.util.Scanner;

public class Ex10PokeMon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int nOriginal = n;
        int m = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int targets = 0;
        while(n >= m){
            n -= m;
            targets++;
            if(0.5 * nOriginal == n && y !=0){
                n /= y;
            }
        }
        System.out.println(n);
        System.out.println(targets);
    }
}
