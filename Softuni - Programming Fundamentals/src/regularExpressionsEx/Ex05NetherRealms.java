package regularExpressionsEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex05NetherRealms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] demonsNames = sc.nextLine().split(",");
        Pattern pattern1 = Pattern.compile("[^0-9+\\-*/.]");
        Pattern pattern2 = Pattern.compile("-?\\+?[0-9]+\\.?[0-9]*");
        Pattern pattern3 = Pattern.compile("[*/]");
        for (int i = 0; i <= demonsNames.length-1; i++) {
            String currentName = demonsNames[i].replaceAll(" ", "");
            if (!currentName.contains(" ")) {
                Matcher healthMatcher = pattern1.matcher(currentName);
                Matcher baseDamageMatcher = pattern2.matcher(currentName);
                Matcher matcher3 = pattern3.matcher(currentName);
                int totalHealth = 0;
                double baseDamage = 0;
                while (healthMatcher.find()) {
                    int addHealth = healthMatcher.group().charAt(0);
                    totalHealth += addHealth;
                }
                while (baseDamageMatcher.find()) {
                    double currentNum = Double.parseDouble(baseDamageMatcher.group());
                    baseDamage += currentNum;
                }
                while (matcher3.find()) {
                    if (matcher3.group().equals("*")) {
                        baseDamage *= 2;
                    } else {
                        baseDamage /= 2;
                    }

                }
                System.out.printf("%s - %d health, %.2f damage%n", currentName, totalHealth, baseDamage);
            }
        }
    }
}
