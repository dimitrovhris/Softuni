package associativeArraysEx;

import java.util.*;

public class MoreEx01Ranking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, String> contestList = new LinkedHashMap<>();
        Map <String, Map<String, Integer>> studentsInfo = new TreeMap<>();
        String bestStudent = "";
        int maxPoints = 0;
        while(!input.equals("end of contests")){
            String contest = input.split(":")[0];
            String password = input.split(":")[1];
            contestList.put(contest, password);
            input = sc.nextLine();
        }
        input = sc.nextLine();
        while(!input.equals("end of submissions")){
            String inputContest = input.split("=>")[0];
            String inputPassword = input.split("=>")[1];
            String username = input.split("=>")[2];
            int points = Integer.parseInt(input.split("=>")[3]);
            if(contestList.containsKey(inputContest)){
                if(inputPassword.equals(contestList.get(inputContest))){
                    if(!studentsInfo.containsKey(username)){
                        studentsInfo.put(username, new TreeMap<>());
                        studentsInfo.get(username).put(inputContest, points);
                    }
                    else{
                        if(studentsInfo.get(username).containsKey(inputContest)){
                            if(points > studentsInfo.get(username).get(inputContest)){
                                studentsInfo.get(username).put(inputContest, points);
                            }
                        }
                        else{
                            studentsInfo.get(username).put(inputContest, points);
                        }
                    }
                }
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, Map<String, Integer>> entry : studentsInfo.entrySet()) {
            int currentTotalPoints = 0;
            for (Map.Entry<String, Integer> innerEntry : studentsInfo.get(entry.getKey()).entrySet()) {
                currentTotalPoints += innerEntry.getValue();
            }
            if(currentTotalPoints > maxPoints){
                maxPoints = currentTotalPoints;
                bestStudent = entry.getKey();
            }
        }
        Map<String, Integer> reversed = new LinkedHashMap<>();
        System.out.printf("Best candidate is %s with total %d points.%n", bestStudent, maxPoints);
        System.out.println("Ranking:");
        for (Map.Entry<String, Map<String, Integer>> entry : studentsInfo.entrySet()) {
            System.out.println(entry.getKey());
            entry.getValue().entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .forEachOrdered(x -> reversed.put(x.getKey(), x.getValue()));
            for (Map.Entry<String, Integer> innerEntry : reversed.entrySet()){
                System.out.printf("# %s -> %d%n", innerEntry.getKey(), innerEntry.getValue());
            }
        }
    }
}
