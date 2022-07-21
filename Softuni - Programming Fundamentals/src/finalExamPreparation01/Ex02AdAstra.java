package finalExamPreparation01;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02AdAstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String foodInfo = sc.nextLine();
        Pattern pattern = Pattern.compile("([#|])(?<foodName>[A-Za-z\\s+]*)\\1(?<date>\\d{2}\\/\\d{2}\\/\\d{2})\\1(?<calories>\\d{1,5})\\1");
        Matcher matcher = pattern.matcher(foodInfo);
        int totalCalories = 0;
        List<String> info = new ArrayList<>();
        while(matcher.find()){
            String foodName = matcher.group("foodName");
            String bestBefore = matcher.group("date");
            int calories = Integer.parseInt(matcher.group("calories"));
            info.add(foodName);
            info.add(bestBefore);
            info.add("" + calories);
            totalCalories += calories;
        }
        int days = totalCalories / 2000;
        System.out.printf("You have food to last you for: %d days!%n", days);
        if(!info.isEmpty()){
            for(int i = 0; i <= info.size()-1; i+=3){
                System.out.printf("Item: %s, ", info.get(i));
                System.out.printf("Best before: %s, ", info.get(i+1));
                System.out.printf("Nutrition: %s%n", info.get(i + 2));
            }
        }
    }
}
