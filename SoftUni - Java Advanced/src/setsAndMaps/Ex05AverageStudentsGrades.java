package setsAndMaps;

import java.util.*;

public class Ex05AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<Double>> studentsInfo = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            String[] data = sc.nextLine().split(" ");
            String name = data[0];
            double grade = Double.parseDouble(data[1]);
            if(!studentsInfo.containsKey(name)){
                studentsInfo.put(name, new ArrayList<>());
            }
            studentsInfo.get(name).add(grade);
        }
        for (Map.Entry<String, List<Double>> entry : studentsInfo.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            double totalSum = 0;
            for(double grade: entry.getValue()){
                totalSum += grade;
                System.out.printf("%.2f ", grade);
            }
            System.out.printf("(avg: %.2f)%n", totalSum / entry.getValue().size());
        }
    }
}
