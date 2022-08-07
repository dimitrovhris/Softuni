package finalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex02BossRush {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Pattern namePattern = Pattern.compile("\\|(?<name>[A-Z]{4,})\\|");
        Pattern titlePattern = Pattern.compile(":#(?<title>[A-Za-z]+ [A-Za-z]+)#");
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            Matcher matchName = namePattern.matcher(input);
            Matcher matchTitle = titlePattern.matcher(input);
            if(matchName.find() && matchTitle.find()){
                String name = matchName.group("name");
                String title = matchTitle.group("title");
                System.out.printf("%s, The %s%n", name, title);
                System.out.printf(">> Strength: %d%n", name.length());
                System.out.printf(">> Armor: %d%n", title.length());
            }
            else{
                System.out.println("Access denied!");
            }
        }
    }
}
