package nestedLoopsEx;
import java.util.Scanner;
public class NestedLoopEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        int grades = 0;
        double totalGradeSum = 0;
        while(!input.equals("Finish")){
            double currentGrade = 0;
            double currentSum = 0;
            for(int i = 1; i<=n; i++){
                 currentGrade = Double.parseDouble(sc.nextLine());
                 currentSum += currentGrade;
                 totalGradeSum += currentGrade;
                 grades++;
            }

            double currentAverageGrade = currentSum / n;
            System.out.printf("%s - %.2f%n", input,currentAverageGrade);
            input = sc.nextLine();
        }
        double finalAverageGrade = totalGradeSum/ grades;
        System.out.printf("Student's final assessment is %.2f", finalAverageGrade);
    }
}
