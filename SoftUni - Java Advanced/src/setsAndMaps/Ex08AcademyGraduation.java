package setsAndMaps;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex08AcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Double> studentsInfo = new TreeMap<>();
        for(int i = 1; i <= n; i++){
            String name = sc.nextLine();
            double[] grades = Arrays.stream(sc.nextLine().split(" "))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            double totalSum = 0;
            for(double grade: grades){
                totalSum += grade;
            }
            double average = totalSum / grades.length;
            studentsInfo.put(name, average);
        }
        for (Map.Entry<String, Double> entry : studentsInfo.entrySet()) {
            System.out.printf("%s is graduated with ", entry.getKey());
            System.out.println((entry.getValue()));
        }
    }
}
