package associativeArraysEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01CountCharsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<Character, Integer> characters = new LinkedHashMap<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            char currentChar = input.charAt(i);
            if (currentChar != ' ') {
                if (!characters.containsKey(currentChar)) {
                    characters.put(currentChar, 1);
                } else {
                    characters.put(currentChar, characters.get(currentChar) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : characters.entrySet()) {
            System.out.printf("%c -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
