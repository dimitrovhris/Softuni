package loopsEx;
import java.util.Scanner;
public class MoreLoops2 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int days = Integer.parseInt(readData.nextLine());
        int doctors = 7;
        int treatedPatients = 0;
        int untreatedPatients = 0;
        int totalTreatedPatients = 0;
        int totalUntreatedPatients = 0;

        for (int i = 1; i <= days; i++){
            int patients = Integer.parseInt(readData.nextLine());

                if (patients <=  doctors){
                    treatedPatients = patients;
                }
                else {
                    treatedPatients = doctors;
                    untreatedPatients = patients - doctors;
                }
            totalTreatedPatients = totalTreatedPatients + treatedPatients;
            totalUntreatedPatients = totalUntreatedPatients + untreatedPatients;
            if (i % 2 == 0){
                if(totalUntreatedPatients > totalTreatedPatients){
                    doctors++;
                }
            }
            untreatedPatients = 0;
            treatedPatients = 0;
        }
        System.out.printf("Treated patients: %d\n", totalTreatedPatients);
        System.out.printf("Untreated patients: %d\n", totalUntreatedPatients);
    }
}
