package realEXAM1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int maxNow = Integer.MIN_VALUE;
        String bestPlayer = "";
        int goals = Integer.parseInt(sc.nextLine());
        while(!input.equals("END")){
            if(goals > maxNow){
                bestPlayer = input;
                maxNow = goals;
            }
            if(goals >= 10)
                break;
            input = sc.nextLine();
            if(!input.equals("END"))
            goals = Integer.parseInt(sc.nextLine());
        }

        if(maxNow >= 3)
            System.out.printf("%s is the best player!%nHe has scored %d goals and made a hat-trick !!!", bestPlayer, maxNow);
        else{
            System.out.printf("%s is the best player!%nHe has scored %d goals.", bestPlayer, maxNow);
        }
    }
}
