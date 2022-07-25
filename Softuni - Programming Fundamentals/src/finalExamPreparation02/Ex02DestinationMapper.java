package finalExamPreparation02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02DestinationMapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Pattern pattern = Pattern.compile("([=/])(?<destination>[A-Z][a-zA-Z]{2,})\\1");
        Matcher matcher = pattern.matcher(input);
        List<String> destinations = new ArrayList<>();
        int totalPoints = 0;
        while(matcher.find()){
            String currentDestination = matcher.group("destination");
            totalPoints += currentDestination.length();
            destinations.add(currentDestination);
        }
        System.out.printf("Destinations: %s%n", String.join(", ", destinations));
        System.out.printf("Travel Points: %d", totalPoints);
    }
}
