package textProcessing;

import java.util.Scanner;

public class Ex02RepeatStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        for(int i = 0; i <= input.length-1; i++){
            System.out.printf("%s", repeatString(input[i]));
        }
    }
    public static String repeatString (String word){
        StringBuilder repeatedWord = new StringBuilder();
        for(int i = 1; i <= word.length(); i++){
            repeatedWord.append(word);
        }
        return  repeatedWord.toString();
    }
}
