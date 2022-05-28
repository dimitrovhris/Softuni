package exExam8and9;

import java.util.Scanner;

public class exam96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int moviesCount = 0;
        String favouriteMovie = "";
        int maxNow = Integer.MIN_VALUE;
        while(!input.equals("STOP") && moviesCount <= 7){
            int movieLength = input.length();
            int moviePoints = 0;
            int smallLetters = 0;
            int bigLetters = 0;
            for(int i = 0; i <= movieLength - 1; i++){
                char charNow = input.charAt(i);
                moviePoints += charNow;
                if(charNow >= 65 && charNow <= 90){
                    bigLetters++;
                }
                else if(charNow >= 97 && charNow <= 122){
                    smallLetters++;
                }
            }
            moviePoints -= (smallLetters * 2 + bigLetters) * movieLength;
            if(moviePoints > maxNow){
                maxNow = moviePoints;
                favouriteMovie = input;
            }
            moviesCount++;
            if(moviesCount < 7)
            input = sc.nextLine();
        }
        if(!input.equals("STOP")){
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", favouriteMovie, maxNow);
    }
}
