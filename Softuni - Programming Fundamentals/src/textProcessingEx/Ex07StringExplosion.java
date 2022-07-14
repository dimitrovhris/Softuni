package textProcessingEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex07StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        List<Character> symbols = new ArrayList<>();
        for (int i = 0; i <= input.length() - 1; i++) {
            symbols.add(input.charAt(i));
        }
        int strength = 0;
        for (int i = 0; i <= symbols.size() - 1; i++) {
            int usedStrength = 0;
            if (symbols.get(i) == '>') {
                strength += Integer.parseInt("" + symbols.get(i + 1));
                for (int j = 1; j <= strength; j++) {
                    if (i != symbols.size() - 1) {
                        if (symbols.get(i + 1) != '>') {
                            symbols.remove(i + 1);
                            usedStrength++;

                        } else {
                            break;
                        }
                    }
                }
                strength -= usedStrength;
            }
        }
        for (char symbol : symbols) {
            System.out.printf("%s", symbol);
        }
    }
}
