package definingClassesEx.companyRoster;

import java.util.*;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> departments = new HashMap<>();
        List<Employee> employees = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0) {
            String[] data = sc.nextLine().split(" ");
            Employee employee;
            if (data.length == 6) {
                employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3],
                        data[4], Integer.parseInt(data[5]));
            } else if (data.length == 5) {
                if (data[4].contains("@")) {
                    employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], data[4]);
                } else {
                    employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3], Integer.parseInt(data[4]));
                }
            } else {
                employee = new Employee(data[0], Double.parseDouble(data[1]), data[2], data[3]);
            }
            employees.add(employee);
            departments.putIfAbsent(data[3], new ArrayList<>());
            departments.get(data[3]).add(Double.parseDouble(data[1]));
        }
        String bestDepartment = findMaxAverageSalary(departments);
        System.out.printf("Highest Average Salary: %s%n", bestDepartment);
        Predicate<Employee> filter = e -> e.getDepartment().equals(bestDepartment);
        employees.stream()
                .filter(filter)
                .sorted((s1, s2) -> Double.compare(s2.getSalary(), s1.getSalary()))
                .forEach(System.out::println);
    }

    public static String findMaxAverageSalary(Map<String, List<Double>> departments) {
        String maxDepartment = "";
        double maxAverage = 0;
        for (Map.Entry<String, List<Double>> entry : departments.entrySet()) {
            double currentAverage = entry.getValue().stream().mapToDouble(e -> e).average().orElse(0);
            if (currentAverage > maxAverage) {
                maxAverage = currentAverage;
                maxDepartment = entry.getKey();
            }
        }
        return maxDepartment;
    }
}
