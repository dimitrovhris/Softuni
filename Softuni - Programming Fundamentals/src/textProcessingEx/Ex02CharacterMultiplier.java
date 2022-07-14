package textProcessingEx;

import java.util.Scanner;

public class Ex02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");
        System.out.println(charactersMultiplier(words[0], words[1]));
    }
    public static int charactersMultiplier (String string1, String string2){
        int totalSum = 0;
        int minLength = Math.min(string1.length(), string2.length());
        String maxString = "";
        if(string1.length() > string2.length()){
            maxString = string1;
        }
        else{
            maxString = string2;
        }
        for(int i = 0; i <= minLength-1; i++){
            int currentMultiplication = string1.charAt(i) * string2.charAt(i);
            totalSum += currentMultiplication;
        }
        String remain = maxString.substring(minLength);
        for(int i = 0; i <= remain.length()-1; i++){
            totalSum += remain.charAt(i);
        }
        return totalSum;
    }
}
