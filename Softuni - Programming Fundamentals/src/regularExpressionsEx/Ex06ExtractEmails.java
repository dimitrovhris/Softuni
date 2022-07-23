package regularExpressionsEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06ExtractEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+@[A-Za-z0-9]+-?[A-Za-z0-9]+[\\.[A-Za-z0-9]+-?[A-Za-z0-9]+]*\\b");
        Matcher matcher = pattern.matcher(input);
        while(matcher.find()){
            String text = matcher.group();
            System.out.println(matcher.group());
        }
    }
}
