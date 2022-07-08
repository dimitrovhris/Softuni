package associativeArraysEx;

import java.util.*;

public class Ex07StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<Double>> studentInfo = new LinkedHashMap<>();
        int n  = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            if(!studentInfo.containsKey(name)){
                studentInfo.put(name, new ArrayList<>());
            }
            studentInfo.get(name).add(grade);

        }
        for (Map.Entry<String, List<Double>> entry : studentInfo.entrySet()) {
            double totalSum = 0;
            for(double num : entry.getValue()){
                totalSum += num;
            }
            double currentAverage = totalSum / entry.getValue().size();
            if(currentAverage >= 4.50){
                System.out.printf("%s -> %.2f%n", entry.getKey(), currentAverage);
            }
        }

    }
}
