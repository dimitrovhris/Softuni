package textProcessingEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> letters = new ArrayList<>();
        for(int i = 0; i <= input.length()-1; i++){
            letters.add(input.charAt(i));
        }
        for (int i = 0; i <= letters.size() - 1; i++) {
                while(i != letters.size()-1 && letters.get(i) == letters.get(i + 1) ){
                    letters.remove(i + 1);
                }
        }
        for(char letter: letters){
            System.out.printf("%s", letter);
        }
    }
}
