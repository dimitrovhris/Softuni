package textProcessingEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().split("\\s+");
        double totalSum = 0;
        for(String sequence: strings){
            char firstLetter = sequence.charAt(0);
            char lastLetter = sequence.charAt(sequence.length()-1);
            double num = Integer.parseInt(sequence.substring(1, sequence.length()-1));
            //First Letter
            int firstLetterPosition;
            int lastLetterPosition;
            double currentSum = 0;
            if(Character.isUpperCase(firstLetter)){
                firstLetterPosition = firstLetter - 64;
                currentSum += (num / firstLetterPosition);
            }
            else{
                firstLetterPosition = firstLetter - 96;
                currentSum += (num * firstLetterPosition);
            }
            //Last Letter
            if(Character.isUpperCase(lastLetter)){
                lastLetterPosition = lastLetter - 64;
                currentSum -= lastLetterPosition;
            }
            else{
                lastLetterPosition= lastLetter - 96;
                currentSum += lastLetterPosition;
            }
            totalSum += currentSum;
        }
        System.out.printf("%.2f", totalSum);
    }

}
