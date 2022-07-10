package associativeArraysEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex10SoftuniExamResults {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, Integer> studentsInfo = new LinkedHashMap<>();
        HashMap<String , Integer> languageInfo = new LinkedHashMap<>();
        while(!input.equals("exam finished")){
            String[] splitInput = input.split("-");
            if(splitInput.length == 3){
                String name = splitInput[0];
                String language = splitInput[1];
                int points = Integer.parseInt(splitInput[2]);
                if(!studentsInfo.containsKey(name)){
                    studentsInfo.put(name, points);
                }
                else{
                    if(studentsInfo.get(name) < points){
                        studentsInfo.put(name, points);
                    }
                }
                if(!languageInfo.containsKey(language)){
                    languageInfo.put(language, 1);
                }
                else{
                    languageInfo.put(language, languageInfo.get(language) + 1);
                }
            }
            else{
                studentsInfo.remove(splitInput[0]);
            }
            input = sc.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : studentsInfo.entrySet()) {
            System.out.printf("%s | %d%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");
        for (Map.Entry<String, Integer> entry : languageInfo.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }

    }
}
