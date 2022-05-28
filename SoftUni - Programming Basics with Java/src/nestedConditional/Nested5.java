package nestedConditional;

import java.util.Scanner;

public class Nested5 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        double number = Double.parseDouble(readData.nextLine());

        boolean isTrue = number <= 100 && number >= -100 && number != 0;
        if(isTrue){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}

