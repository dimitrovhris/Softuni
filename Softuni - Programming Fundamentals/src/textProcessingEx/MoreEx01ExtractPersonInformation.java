package textProcessingEx;

import java.util.Scanner;

public class MoreEx01ExtractPersonInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            StringBuilder name = new StringBuilder();
            StringBuilder age = new StringBuilder();
            String sentence = sc.nextLine();
            for(int j = 0; j <= sentence.length()-1; j++){
                if(sentence.charAt(j) == '@'){
                    while(sentence.charAt(j) != '|'){
                        name.append(sentence.charAt(j));
                        j++;
                    }
                }
                if(sentence.charAt(j) == '#'){
                    while(sentence.charAt(j) != '*'){
                        age.append(sentence.charAt(j));
                        j++;
                    }
                }

            }
            System.out.printf("%s is %s years old.%n", name.substring(1), age.substring(1));
        }
    }
}
