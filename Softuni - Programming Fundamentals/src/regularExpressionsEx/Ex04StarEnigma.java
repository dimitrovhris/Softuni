package regularExpressionsEx;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex04StarEnigma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pattern pattern1 = Pattern.compile("[STARstar]");
        Pattern pattern2 = Pattern.compile("@(?<name>[A-Z]*[a-z]*)[^@\\-!:>]*:(?<population>[0-9]+)[^@\\-!:>]*!" +
                "(?<attackType>[AD])![^@\\-!:>]*->(?<soldiers>\\d+)");
        List<String> attackedPlanets = new ArrayList<>();
        List<String> destroyedPlanets = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            StringBuilder decryptedMessage = new StringBuilder();
            String input = sc.nextLine();
            Matcher star = pattern1.matcher(input);
            int counter = 0;
            while(star.find()){
                counter++;
            }
            for(int j = 0; j <= input.length()-1; j++){
                decryptedMessage.append((char)(input.charAt(j)-counter));
            }
            Matcher matcher = pattern2.matcher(decryptedMessage);
            if(matcher.find()){
                String planetName = matcher.group("name");
                String attackType = matcher.group("attackType");
                if(attackType.equals("D")){
                    destroyedPlanets.add(planetName);
                }
                else{
                    attackedPlanets.add(planetName);
                }
            }
        }
        if(!attackedPlanets.isEmpty()){
            Collections.sort(attackedPlanets);
            System.out.printf("Attacked planets: %d%n", attackedPlanets.size());
            for(String planet: attackedPlanets){
                System.out.printf("-> %s%n", planet);
            }
        }
        else{
            System.out.println("Attacked planets: 0");
        }
        if(!destroyedPlanets.isEmpty()){
            Collections.sort(destroyedPlanets);
            System.out.printf("Destroyed planets: %d%n", destroyedPlanets.size());
            for(String planet: destroyedPlanets){
                System.out.printf("-> %s%n", planet);
            }
        }
        else{
            System.out.println("Destroyed planets: 0");
        }
    }
}
