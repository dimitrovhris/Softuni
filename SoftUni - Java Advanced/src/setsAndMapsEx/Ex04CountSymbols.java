package setsAndMapsEx;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex04CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<Character, Integer> symbols = new TreeMap<>();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (!symbols.containsKey(currentChar)) {
                symbols.put(currentChar, 0);
            }
            symbols.put(currentChar, symbols.get(currentChar) + 1);
        }
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
