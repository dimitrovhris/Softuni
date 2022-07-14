package textProcessing;

import java.util.Scanner;

public class Ex04TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();
        for (int i = 0; i <= bannedWords.length - 1; i++) {
            text = text.replace(bannedWords[i], toReplace(bannedWords[i]));
        }
        System.out.println(text);
    }

    public static String toReplace(String word) {
        String result = "";
        for (int i = 0; i <= word.length() - 1; i++) {
            result += "*";
        }
        return result;
    }
}
