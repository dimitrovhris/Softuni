package basicSyntaxEx;

import java.util.Scanner;

public class MoreBasicEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        String newWord = "";
        for(int i = word.length()-1; i >= 0; i--){
            newWord += word.charAt(i);
        }
        System.out.println(newWord);
    }
}
