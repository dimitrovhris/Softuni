package basicSyntaxEx;

import java.util.Scanner;

public class MoreBasicEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int maxNum = Integer.MIN_VALUE;

        int minNum = Integer.MAX_VALUE;
            if(a > maxNum){
                maxNum = a;
            }
            if(b > maxNum){
                maxNum = b;
            }
            if(c > maxNum){
                maxNum = c;
            }
            if(a < minNum){
                minNum = a;
            }
            if(b < minNum){
                minNum = b;
            }
            if(c < minNum){
                minNum = c;
            }
        int middleNum = a + b + c - (minNum + maxNum);
        System.out.println(maxNum);
        System.out.println(middleNum);
        System.out.println(minNum);
    }
}
