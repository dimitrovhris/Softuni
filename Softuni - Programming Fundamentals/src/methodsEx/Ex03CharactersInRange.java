package methodsEx;

import java.util.Scanner;

public class Ex03CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char inputChar1 = sc.nextLine().charAt(0);
        char inputChar2 = sc.nextLine().charAt(0);
        receiveCharactersInRange(inputChar1, inputChar2);
    }
    public static void receiveCharactersInRange(char char1, char char2){
        for(int i = char1 + 1; i <= char2 - 1; i++){
            System.out.printf("%c ", i);
        }
    }
}
