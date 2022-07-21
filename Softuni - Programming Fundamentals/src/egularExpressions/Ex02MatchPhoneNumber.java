package egularExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02MatchPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("\\+359([\\s-])2\\1\\d{3}\\1\\d{4}\\b");
        Matcher matcher = pattern.matcher(text);

        List<String> validNumbers = new ArrayList<>();
        while(matcher.find()){
            validNumbers.add(matcher.group());
        }
        System.out.println(String.join(", ", validNumbers));
    }
}
