package conditionalStatements;

import java.util.Scanner;

public class Conditional3 {
    public static void main(String[] args) {

        Scanner readData = new Scanner(System.in);

        int a = Integer.parseInt(readData.nextLine());

        if (a % 2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }

    }
}
