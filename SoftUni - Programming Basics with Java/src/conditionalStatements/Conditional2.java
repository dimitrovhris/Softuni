package conditionalStatements;

import java.util.Scanner;

public class Conditional2 {

    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        int a = Integer.parseInt(readData.nextLine());
        int b = Integer.parseInt(readData.nextLine());

        if (a > b) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
}
