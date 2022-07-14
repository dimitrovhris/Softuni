package textProcessing;

import java.util.Scanner;

public class Ex05DigitsLettersAndOthers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder others = new StringBuilder();
        for(int i = 0; i <= input.length()-1; i++){
            if(Character.isDigit(input.charAt(i))){
                digits.append(input.charAt(i));
            }
            else if(Character.isLetter(input.charAt(i))){
                letters.append(input.charAt(i));
            }
            else{
                others.append((input.charAt(i)));
            }
        }
        System.out.println(digits);
        System.out.println(letters);
        System.out.println(others);
    }
}
