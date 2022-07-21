package regularExpressionsEx;


import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Ex02Race {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputNames = sc.nextLine().split(", ");
        Map<String, Integer> gameInfo = new LinkedHashMap<>();

        for(String name: inputNames){
            gameInfo.put(name, 0);
        }
        Pattern pattern = Pattern.compile("\\w");
        String input = sc.nextLine();
        while(!input.equals("end of race")){
            Matcher matcher = pattern.matcher(input);
            StringBuilder currentName = new StringBuilder();
            int currentKilometers = 0;
            while(matcher.find()){
                if(Character.isLetter(matcher.group().charAt(0))){
                    currentName.append(matcher.group());
                }
                else if(Character.isDigit(matcher.group().charAt(0))){
                    currentKilometers += Integer.parseInt(matcher.group());
                }

            }
            if(gameInfo.containsKey(currentName.toString())){
                gameInfo.put(currentName.toString(), gameInfo.get(currentName.toString()) + currentKilometers);
            }
            input = sc.nextLine();
        }
        Map<String, Integer> newMap = new LinkedHashMap<>();

        List<String> names = gameInfo.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        int i = 1;
        System.out.printf("1st place: %s%n", names.get(0));
        System.out.printf("2nd place: %s%n", names.get(1));
        System.out.printf("3rd place: %s", names.get(2));
    }
}
