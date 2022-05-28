package dataTypes;

import java.util.Scanner;

public class Ex10SpecialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            int sum = 0;
            String currentNum = Integer.toString(i);
            for(int j = 0; j < currentNum.length(); j++){
                sum += Integer.parseInt("" + currentNum.charAt(j));
            }
            if(sum == 5 || sum == 7 || sum == 11){
                System.out.printf("%d -> True%n", i);
            }
            else{
                System.out.printf("%d -> False%n", i);
            }
        }
    }
}
