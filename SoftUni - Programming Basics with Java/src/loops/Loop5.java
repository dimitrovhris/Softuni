package loops;

import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        String text = readData.nextLine();

        for (int i = 0; i < text.length(); i++){
            char letter = text.charAt(i);
            System.out.println(letter);
        }

    }
}
