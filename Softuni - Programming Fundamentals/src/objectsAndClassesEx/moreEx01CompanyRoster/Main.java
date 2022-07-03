package objectsAndClassesEx.moreEx01CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Employee> employees = new ArrayList<>();
        double maxAverageSalary = Double.MIN_VALUE;
        String maxDepartment = "";
        for (int i = 1; i <= n; i++) {
            boolean email = false;
            boolean age = false;
            String[] inputData = sc.nextLine().split(" ");
            Employee employee = new Employee(inputData[0], Double.parseDouble(inputData[1]), inputData[2], inputData[3]);
            if (inputData.length > 4) {
                if (inputData.length == 5) {
                    for (int j = 0; j <= inputData[4].length() - 1; j++) {
                        if (inputData[4].charAt(j) == '@') {
                            email = true;
                            employee.setEmail(inputData[4]);
                            break;
                        }
                    }
                    if (!email) {
                        employee.setAge(Integer.parseInt(inputData[4]));
                    }
                } else {
                    employee.setEmail(inputData[4]);
                    employee.setAge(Integer.parseInt(inputData[5]));
                }
            }
            employees.add(employee);
        }
        for(int i = 0; i <= employees.size()-1; i++){
            int counter = 0;
            double totalDepartmentSalary = 0;
            for(Employee item: employees){
                if(item.getDepartment().equals(employees.get(i).getDepartment())){
                    totalDepartmentSalary += item.getSalary();
                    counter++;
                }
            }
            double averageSalary = totalDepartmentSalary / counter;
            if(averageSalary > maxAverageSalary){
                maxAverageSalary = averageSalary;
                maxDepartment = employees.get(i).getDepartment();
            }
        }
        employees.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        System.out.printf("Highest Average Salary: %s%n", maxDepartment);
        for (Employee item : employees) {
            if (item.getDepartment().equals(maxDepartment)) {
                System.out.println(item);
            }
        }
    }
}
