package whileLoopsEx;

import java.util.Scanner;

public class WhileEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int badGrades = Integer.parseInt(sc.nextLine());
        String task = sc.nextLine();
        double grade;
        int grades = 0;
        double gradeSum = 0;
        String lastTask = "";
        int poorGrades = 0;
        while(!task.equals("Enough") && poorGrades < badGrades) {
            lastTask = task;
            grade = Double.parseDouble(sc.nextLine());
            if (grade <= 4) {
               poorGrades++;
            }
            gradeSum += grade;
            grades++;
            if (poorGrades < badGrades)
            task = sc.nextLine();
        }
        double averageScore = gradeSum / grades;
        if(task.equals("Enough")){
            System.out.printf("Average score: " + "%.2f\n", averageScore);
            System.out.println("Number of problems: " + grades);
            System.out.println("Last problem:" + lastTask);
        }
        else{
            System.out.println("You need a break, " + badGrades + " poor grades.");
        }
    }
}
