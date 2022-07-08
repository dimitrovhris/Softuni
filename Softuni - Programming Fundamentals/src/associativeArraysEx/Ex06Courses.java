package associativeArraysEx;

import java.util.*;

public class Ex06Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashMap<String, List<String>> list = new LinkedHashMap<>();
        while(!input.equals("end")){
            String course = input.split(" : ")[0];
            String name = input.split(" : ")[1];
            if(!list.containsKey(course)){
                list.put(course, new ArrayList<>());
            }
            list.get(course).add(name);
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry: list.entrySet()) {
            System.out.printf("%s : %d%n", entry.getKey(), entry.getValue().size());
            for(int i = 0; i <= entry.getValue().size()-1; i++){
                System.out.printf("-- %s%n", entry.getValue().get(i));
            }
        }

    }
}
