package objectsAndClassesEx.ex05Students;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String[] input = sc.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            Student student = new Student(firstName, lastName, grade);
            students.add(student);
        }
        students.sort(Comparator.comparingDouble(Student :: getGrade).reversed());
        for(Student item: students){
            System.out.println(item);
        }
    }
}
