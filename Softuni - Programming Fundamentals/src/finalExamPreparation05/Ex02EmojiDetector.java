package finalExamPreparation05;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02EmojiDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern numPattern = Pattern.compile("\\d");
        Pattern emojiPattern = Pattern.compile("([:*])\\1(?<emoji>[A-Z][a-z]{2,})\\1\\1");
        Matcher matchNums = numPattern.matcher(input);
        Matcher matchEmojis = emojiPattern.matcher(input);
        BigInteger threshold = new BigInteger("1");
        while(matchNums.find()){
            threshold = threshold.multiply(BigInteger.valueOf(Integer.parseInt(matchNums.group())));
        }
        int totalEmojis = 0;
        List<String> coolEmojis = new ArrayList<>();
        while(matchEmojis.find()){
            totalEmojis++;
            String currentEmoji = matchEmojis.group("emoji");
            BigInteger totalSum = BigInteger.valueOf(0);
            for(int i = 0; i <= currentEmoji.length()-1; i++){
                totalSum = totalSum.add(BigInteger.valueOf(currentEmoji.charAt(i)));
            }
            if(totalSum.compareTo(threshold) >= 0){
                coolEmojis.add(matchEmojis.group());
            }
        }
        System.out.println("Cool threshold: " + threshold);
        System.out.printf("%d emojis found in the text. The cool ones are:%n", totalEmojis);
        for(String emoji: coolEmojis){
            System.out.println(emoji);
        }
    }
}
