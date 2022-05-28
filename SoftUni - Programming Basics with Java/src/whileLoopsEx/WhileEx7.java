package whileLoopsEx;

import java.util.Scanner;

public class WhileEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int houseWidth = Integer.parseInt(sc.nextLine());
        int houseLength = Integer.parseInt(sc.nextLine());
        int houseHeight = Integer.parseInt(sc.nextLine());
        int houseVolume = houseWidth * houseLength * houseHeight;

        String input = sc.nextLine();
        int totalVolume = 0;

        while(!input.equals("Done") && totalVolume <= houseVolume){
            int plusVolume = Integer.parseInt(input);
            totalVolume += plusVolume;
            if (totalVolume <= houseVolume){
                input = sc.nextLine();
            }
        }
        int cubicMoreLeft = Math.abs(totalVolume - houseVolume);
        if(input.equals("Done")){
            System.out.println(cubicMoreLeft + " Cubic meters left.");
        }
        else{
            System.out.printf("No more free space! You need %d Cubic meters more.", cubicMoreLeft);
        }
    }
}
