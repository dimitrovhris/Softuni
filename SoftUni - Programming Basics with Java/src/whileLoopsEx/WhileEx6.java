package whileLoopsEx;

import java.util.Scanner;

public class WhileEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cakeLength = Integer.parseInt(sc.nextLine());
        int cakeWidth = Integer.parseInt(sc.nextLine());
        int cakeArea = cakeLength * cakeWidth;

        String input = sc.nextLine();

        int totalPieces = 0;
        while(!input.equals("STOP") && totalPieces <= cakeArea){
            int piece = Integer.parseInt(input);
            totalPieces += piece;

            if(totalPieces < cakeArea){
            input = sc.nextLine();
            }
        }
        int cakesLeft = Math.abs(cakeArea - totalPieces);
        if(input.equals("STOP")){
            System.out.println(cakesLeft + " pieces are left.");
        }
        else{
            System.out.println("No more cake left! You need " + cakesLeft + " pieces more.");
        }
    }
}
