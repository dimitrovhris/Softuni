package finalExamPreparation03;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02MirrorWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("([#@])(?<firstWord>[A-Za-z]{3,})\\1\\1(?<secondWord>[A-Za-z]{3,})\\1");
        Matcher matcher = pattern.matcher(text);
        List<String> mirrorWords = new ArrayList<>();
        int totalPairs = 0;
        while(matcher.find()){
            totalPairs++;
            StringBuilder secondWordReversed = new StringBuilder();
            for(int i = matcher.group("secondWord").length()-1; i >= 0; i--){
                secondWordReversed.append(matcher.group("secondWord").charAt(i));
            }
            if(matcher.group("firstWord").equals(secondWordReversed.toString())){
                mirrorWords.add(matcher.group("firstWord") + " <=> " + matcher.group("secondWord"));
            }
        }
        if(totalPairs == 0){
            System.out.println("No word pairs found!");
        }
        else{
            System.out.printf("%d word pairs found!%n", totalPairs);
        }
        if(mirrorWords.isEmpty()){
            System.out.println("No mirror words!");
        }
        else{
            System.out.println("The mirror words are:");
            System.out.println(String.join(", ", mirrorWords));
        }
    }
}
