package loopsEx;
import java.util.Scanner;
public class MoreLoops4 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);
        int students = Integer.parseInt(readData.nextLine());
        int students2to99 = 0;
        int students3to99 = 0;
        int students4to99 = 0;
        int students5to6 = 0;
        double totalStudents = 0;
        double sum = 0;

        for(int i = 1; i <= students; i++){
            double grade = Double.parseDouble(readData.nextLine());
            if (grade <= 2.99){
                students2to99++;
            }
            else if(grade <= 3.99){
                students3to99++;
            }else if (grade <= 4.99){
                students4to99++;
            }else if(grade <= 6){
                students5to6++;
            }
            totalStudents++;
            sum = sum + grade;

        }
        double percent2to99 = students2to99 * 100 / totalStudents;
        double percent3to99 = students3to99 * 100 / totalStudents;
        double percent4to99 = students4to99 * 100 / totalStudents;
        double percent5to6 = students5to6 * 100 / totalStudents;
        double average = sum / totalStudents;

        System.out.printf("Top students: %.2f%%%n", percent5to6);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", percent4to99);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", percent3to99);
        System.out.printf("Fail: %.2f%%%n", percent2to99);
        System.out.printf("Average: %.2f", average);
    }
}
