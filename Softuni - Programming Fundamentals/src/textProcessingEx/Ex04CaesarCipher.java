package textProcessingEx;

import java.util.Scanner;

public class Ex04CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder text = new StringBuilder();
        StringBuilder newText = new StringBuilder();
        text.append(input);
        for(int i = 0; i <= text.length()-1; i++){
            char charToAppend = (char)(text.charAt(i) + 3);
            newText.append(charToAppend);
        }
        System.out.println(newText);
    }
}
