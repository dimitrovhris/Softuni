package whileLoops;

import java.util.Scanner;

public class While8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double averageGrade = 0;
        int badGrades = 0;
        double gradeSum = 0;
        int klas = 0;
        while(klas <12 && badGrades < 2){
            double grade = sc.nextDouble();
            gradeSum+=grade;
            klas++;
            if (grade < 4){
                badGrades++;
            }
        }
        if(klas == 12){
            averageGrade = gradeSum / 12;
            System.out.printf(name + " graduated. Average grade:" + "%.2f",averageGrade);
        }
        else{
            System.out.println(name + "has been excluded at "+ klas+ " grade.");
        }

    }
}
