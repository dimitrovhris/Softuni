package exExam4;

import java.util.Scanner;

public class exam44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int eggsFirst = Integer.parseInt(sc.nextLine());
        int eggsSecond = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("End of battle") && eggsFirst > 0 && eggsSecond > 0){
            if(input.equals("one")){
                eggsSecond--;
            }
            else{
                eggsFirst--;
            }
            if(eggsFirst > 0 && eggsSecond > 0)
            input = sc.nextLine();
        }
        if(eggsFirst == 0){
            System.out.printf("Player one is out of eggs. Player two has %d eggs left.", eggsSecond);
        }
        else if(eggsSecond == 0){
            System.out.printf("Player two is out of eggs. Player one has %d eggs left.", eggsFirst);
        }
        else{
            System.out.printf("Player one has %d eggs left.%n", eggsFirst);
            System.out.printf("Player two has %d eggs left.", eggsSecond);
        }
    }
}
