package textProcessingEx;

import java.util.Scanner;

public class MoreEx02AsciiSumator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char charBegin = sc.nextLine().charAt(0);
        char charEnd = sc.nextLine().charAt(0);
        String string = sc.nextLine();
        int sum = 0;
        for(int i = 0; i <= string.length()-1; i++){
            char currentChar = string.charAt(i);
            if(currentChar > charBegin && currentChar < charEnd){
                sum += currentChar;
            }
        }
        System.out.println(sum);
    }
}
