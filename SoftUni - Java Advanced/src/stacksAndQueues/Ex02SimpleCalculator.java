package stacksAndQueues;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayDeque<Integer> digits = new ArrayDeque<>();
        List<String> operatorsList = new ArrayList<>();
        Pattern nums = Pattern.compile("\\d+");
        Pattern operators = Pattern.compile("[+-]");
        Matcher matchNums = nums.matcher(input);
        Matcher matchOperators= operators.matcher(input);

        while(matchNums.find()){
            digits.offer(Integer.parseInt(matchNums.group()));
        }
        while(matchOperators.find()){
            operatorsList.add(matchOperators.group());
        }
        Integer totalSum = digits.poll();
        for(String operator: operatorsList){
            if(operator.equals("+")){
                totalSum += digits.pop();
            }
            else{
                totalSum -= digits.pop();
            }
        }
        System.out.println(totalSum);
    }
}
