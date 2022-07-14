package textProcessingEx;

import java.util.Scanner;

public class Ex01ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] wordList = sc.nextLine().split(", ");
        for(String word: wordList){
            if(word.length()>= 3 && word.length()<=16 && isValidSymbols(word)){
                System.out.println(word);
            }
        }
    }
    public static boolean isValidSymbols (String word){
        boolean result = false;
        for(int i = 0; i<= word.length()-1; i++){
            char currentChar = word.charAt(i);
            if(Character.isLetter(currentChar) || Character.isDigit(currentChar) || currentChar == '-' || currentChar == '_'){
                result = true;
            }
            else{
                result = false;
                break;
            }
        }
        return result;
    }
}
