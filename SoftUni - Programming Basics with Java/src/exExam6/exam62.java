package exExam6;

import java.util.Scanner;

public class exam62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String match1 = sc.nextLine();
        String match2 = sc.nextLine();
        String match3 = sc.nextLine();
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int result1A = Integer.parseInt("" + match1.charAt(0));
        int result1B = Integer.parseInt("" + match1.charAt(2));

        int result2A = Integer.parseInt("" + match2.charAt(0));
        int result2B = Integer.parseInt("" + match2.charAt(2));

        int result3A = Integer.parseInt("" + match3.charAt(0));
        int result3B = Integer.parseInt("" + match3.charAt(2));

        if(result1A > result1B){
            wins++;
        }
        else if (result1A < result1B){
            loses++;
        }
        else{
            draws++;
        }
        if(result2A > result2B){
            wins++;
        }
        else if (result2A < result2B){
            loses++;
        }
        else{
            draws++;
        }
        if(result3A > result3B){
            wins++;
        }
        else if (result3A < result3B){
            loses++;
        }
        else{
            draws++;
        }
        System.out.printf("Team won %d games.%n", wins);
        System.out.printf("Team lost %d games.%n", loses);
        System.out.printf("Drawn games: %d", draws);
    }
}