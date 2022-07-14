package textProcessing;

import java.util.Scanner;

public class Ex01ReverseStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("end")){
            System.out.printf("%s = %s%n", input, reversed(input));
            input = sc.nextLine();

        }
    }
    public static String reversed (String input){
        StringBuilder reversedWord = new StringBuilder();
        for(int i = input.length()-1; i >= 0; i--){
            reversedWord.append(input.charAt(i));
        }
        return reversedWord.toString();
    }
}
