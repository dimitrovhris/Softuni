package methodsEx;

import java.util.Locale;
import java.util.Scanner;

public class Ex02VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine().toLowerCase();
        System.out.println(printTheCountOfTheVowelsInWord(inputString));
    }
    public static int printTheCountOfTheVowelsInWord(String word){
        int count = 0;
        for(int i = 0; i <= word.length()-1; i++){
            switch (word.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }
        return count;
    }
}
