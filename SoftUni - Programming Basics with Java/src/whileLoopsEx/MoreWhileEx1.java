package whileLoopsEx;

import java.util.Scanner;

public class MoreWhileEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bottles = Integer.parseInt(sc.nextLine());
        int totalDetergent = bottles * 750;
        int usedDetergent = 0;
        String input = sc.nextLine();
        int plates = 0;
        int pots = 0;

        for(int i = 1;!input.equals("End") && usedDetergent <= totalDetergent; i++){
            int plus = Integer.parseInt(input);
            if (i % 3 != 0){
                plates += plus;
                usedDetergent += (plus * 5);
            }
            else{
                pots+= plus;
                usedDetergent += (plus * 15);
            }
            if(usedDetergent <= totalDetergent){
                input = sc.nextLine();
            }
        }
        int moreLessDetergent = Math.abs(totalDetergent - usedDetergent);
        if(input.equals("End")){
            System.out.printf("Detergent was enough!\n%d dishes and % d pots were washed.\nLeftover detergent %d ml.", plates, pots,
                    moreLessDetergent);
        }
        else{
            System.out.printf("Not enough detergent, %d ml. more necessary!", moreLessDetergent);
        }
    }
}
