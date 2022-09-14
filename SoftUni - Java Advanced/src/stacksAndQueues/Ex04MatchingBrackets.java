package stacksAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Ex04MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        ArrayDeque <Integer> stack = new ArrayDeque<>();
        for(int i = 0; i <= expression.length()-1; i++){
            char currentChar = expression.charAt(i);
            if(currentChar == '('){
                stack.push(i);
            }
            else if (currentChar == ')'){
                int startIndex = stack.pop();
                System.out.println(expression.substring(startIndex, i + 1));
            }
        }
    }
}
