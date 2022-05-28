package exExam1;

import java.util.Scanner;

public class exam16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "" + Integer.parseInt(sc.nextLine());
        String b = "" + Integer.parseInt(sc.nextLine());
        int firstADigit = Integer.parseInt("" + a.charAt(0));
        int secondADigit = Integer.parseInt("" + a.charAt(1));
        int thirdADigit = Integer.parseInt("" + a.charAt(2));
        int fourthADigit = Integer.parseInt("" + a.charAt(3));

        int firstBDigit = Integer.parseInt("" + b.charAt(0));
        int secondBDigit = Integer.parseInt("" + b.charAt(1));
        int thirdBDigit = Integer.parseInt("" + b.charAt(2));
        int fourthBDigit = Integer.parseInt("" + b.charAt(3));

        for(int i = firstADigit; i <= firstBDigit; i++){
            for(int j = secondADigit; j <= secondBDigit; j++){
                for(int k = thirdADigit; k <= thirdBDigit; k++){
                    for(int l = fourthADigit; l <= fourthBDigit; l++){
                        if(i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0)
                        System.out.printf("%d%d%d%d ", i,j,k,l);
                    }
                }
            }
        }
    }
}
