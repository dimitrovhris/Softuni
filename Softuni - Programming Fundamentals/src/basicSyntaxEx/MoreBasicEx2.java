package basicSyntaxEx;

import java.util.Scanner;

public class MoreBasicEx2 {
    public static String digitInEnglish(int a){
        int lastDigit = a % 10;
        String digitInEnglish = "";
        switch(lastDigit){
            case 0:
                digitInEnglish = "zero";
                break;
            case 1:
                digitInEnglish = "one";
                break;
            case 2:
                digitInEnglish = "two";
                break;
            case 3:
                digitInEnglish = "three";
                break;
            case 4:
                digitInEnglish = "four";
                break;
            case 5:
                digitInEnglish = "five";
                break;
            case 6:
                digitInEnglish = "six";
                break;
            case 7:
                digitInEnglish = "seven";
                break;
            case 8:
                digitInEnglish = "eight";
                break;
            case 9:
                digitInEnglish = "nine";
                break;
        }
        return digitInEnglish;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(digitInEnglish(n));
    }
}
