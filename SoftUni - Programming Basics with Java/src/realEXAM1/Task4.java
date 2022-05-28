package realEXAM1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = Integer.parseInt(sc.nextLine());
        int badStudents = 0;
        int averageStudents = 0;
        int goodStudents = 0;
        int bestStudents = 0;
        double gradeSum = 0;
        for(int i = 1; i <= students; i++){
            double grade = Double.parseDouble(sc.nextLine());
            if(grade >= 2.00 && grade <= 2.99){
                badStudents++;
            }
            else if(grade <= 3.99){
                averageStudents++;
            }
            else if(grade <= 4.99){
                goodStudents++;
            }
            else{
                bestStudents++;
            }
            gradeSum += grade;
        }
        double percentBad = 1.0 * badStudents / students * 100;
        double percentAverage = 1.0 * averageStudents / students * 100;
        double percentGood = 1.0 * goodStudents / students * 100;
        double percentBest = 1.0 * bestStudents / students * 100;
        double average = gradeSum / students;
        System.out.printf("Top students: %.2f%%%n", percentBest);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percentGood);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percentAverage);
        System.out.printf("Fail: %.2f%%%n", percentBad);
        System.out.printf("Average: %.2f", average);
    }
}
