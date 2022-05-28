package nestedLoopsEx;

import java.util.Scanner;

public class MoreNestedLoopEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputBegin = sc.nextLine();
        String inputEnd = sc.nextLine();
        String input3 = sc.nextLine();

        char letterBegin = inputBegin.charAt(0);
        char letterEnd = inputEnd.charAt(0);
        char thirdLetter = input3.charAt(0);

        int counter = 0;
        for(int i =  (int)letterBegin; i<= (int)letterEnd; i++) {
            for(int j = (int)letterBegin; j<= (int)letterEnd; j++){
                for(int k =  (int)letterBegin; k<= (int)letterEnd; k++){
                    if(k != (int)thirdLetter && j != (int)thirdLetter && i != (int) thirdLetter){
                        char currentI = (char) i;
                        char currentJ = (char) j;
                        char currentK = (char) k;
                        System.out.printf("%c%c%c ",currentI,currentJ,currentK);
                        counter++;
                    }
                }
            }
        }
        System.out.print(counter);
    }
}
