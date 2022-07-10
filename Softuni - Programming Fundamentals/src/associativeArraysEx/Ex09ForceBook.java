package associativeArraysEx;

import java.util.*;

public class Ex09ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, List<String>> forceData = new LinkedHashMap<>();
        List<String> commonList = new ArrayList<>();
        while (!input.equals("Lumpawaroo")) {
            if (input.contains(" | ")) {
                String[] case1 = input.split(" \\| ");
                if(!forceData.containsKey(case1[0]) && !commonList.contains(case1[1])){
                    forceData.put(case1[0], new ArrayList<>());
                    forceData.get(case1[0]).add(case1[1]);
                    commonList.add(case1[1]);
                }
                else if(forceData.containsKey(case1[0]) && !commonList.contains(case1[1])){
                    forceData.get(case1[0]).add(case1[1]);
                    commonList.add(case1[1]);
                }
            } else if (input.contains(" -> ")) {
                String[] case2 = input.split(" -> ");
                String forceUser = case2[0];
                String forceSide = case2[1];
                if(!forceData.containsKey(forceSide) && !commonList.contains(forceUser)){
                    forceData.put(forceSide, new ArrayList<>());
                    forceData.get(forceSide).add(forceUser);
                    commonList.add(forceUser);
                }
                else if(forceData.containsKey(forceSide) && !commonList.contains(forceUser)){
                    forceData.get(forceSide).add(forceUser);
                    commonList.add(forceUser);
                }
                else if(commonList.contains(forceUser)){
                    for (Map.Entry<String, List<String>> entry : forceData.entrySet()) {
                        entry.getValue().remove(forceUser);
                    }
                    if(forceData.get(forceSide) != null)
                    forceData.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : forceData.entrySet()) {
            if(entry.getValue().size() >= 1)
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                for(String user: entry.getValue()){
                    System.out.printf("! %s%n", user);
                }
        }
    }
}
