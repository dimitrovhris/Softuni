package dataTypes;

import java.util.Locale;
import java.util.Scanner;

public class Ex08LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.nextLine();
        if(letter.equals(letter.toLowerCase())){
            System.out.println("lower-case");
        }
        else{
            System.out.println("upper-case");
        }
    }
}
