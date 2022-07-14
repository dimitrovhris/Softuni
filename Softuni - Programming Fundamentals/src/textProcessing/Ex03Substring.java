package textProcessing;

import java.util.Scanner;

public class Ex03Substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordToRemove = sc.nextLine();
        String input = sc.nextLine();
        while(input.contains(wordToRemove)){
            input = input.replace(wordToRemove, "");
        }
        System.out.println(input);
    }
}
