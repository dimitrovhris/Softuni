package exExam6;
import java.util.Scanner;
public class exam64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String player1 = sc.nextLine();
        String player2 = sc.nextLine();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int player1Points = 0;
        int player2Points = 0;
        boolean war = false;
        while(!input1.equals("End of game")){
            int card1 = Integer.parseInt(input1);
            int card2 = Integer.parseInt(input2);
            int lessMore = Math.abs(card1 - card2);
            String winner;
            if (card1 > card2){
                player1Points += lessMore;
            }
            else if(card1 < card2){
                player2Points += lessMore;
            }
            else {
                int warPoints;
                war = true;
                card1 = Integer.parseInt(sc.nextLine());
                card2 = Integer.parseInt(sc.nextLine());
                System.out.println("Number wars!");
                if(card1 > card2){
                    winner = player1;
                    warPoints = player1Points;
                }
                else{
                    winner = player2;
                    warPoints = player2Points;
                }
                System.out.printf("%s is winner with %d points", winner, warPoints);
                break;
            }
            input1 = sc.nextLine();
            if(!input1.equals("End of game"))
            input2 = sc.nextLine();
        }
        if(!war){
            System.out.printf("%s has %d points%n", player1, player1Points);
            System.out.printf("%s has %d points", player2, player2Points);
        }

    }
}
