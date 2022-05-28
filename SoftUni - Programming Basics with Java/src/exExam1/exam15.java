package exExam1;
import java.util.Scanner;
public class exam15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int goals = 0;
        int maxNow = 0;
        boolean hatTrick = false;
        String bestFootballer = "";
        while(!input.equals("END") && goals < 10){
            goals = Integer.parseInt(sc.nextLine());
            if(goals > maxNow){
                maxNow = goals;
                bestFootballer = input;
                hatTrick = false;
                if(goals >= 3){
                    hatTrick = true;
                }
            }
            if(goals < 10)
            input = sc.nextLine();
        }

            System.out.printf("%s is the best player!%n", bestFootballer);
        if(hatTrick)
            System.out.printf("He has scored %d goals and made a hat-trick !!!", maxNow);
        else{
            System.out.printf("He has scored %d goals.", maxNow);
        }
    }
}
