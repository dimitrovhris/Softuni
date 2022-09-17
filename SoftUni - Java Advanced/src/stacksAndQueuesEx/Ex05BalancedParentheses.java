package stacksAndQueuesEx;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex05BalancedParentheses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String brackets = sc.nextLine();
        boolean isValid = false;
        if (brackets.length() % 2 == 0) {
            ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
            for (int i = 0; i <= brackets.length() - 1; i++) {
                char currentChar = brackets.charAt(i);
                if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                    openingBrackets.push(currentChar);
                } else {
                    char lastOpening = openingBrackets.pop();
                    if (currentChar == ')' && lastOpening == '(') {
                        isValid = true;
                    } else if (currentChar == '}' && lastOpening == '{') {
                        isValid = true;
                    } else if (currentChar == ']' && lastOpening == '[') {
                        isValid = true;
                    } else {
                        isValid = false;
                        break;
                    }
                }

            }
        }
        if (isValid) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
