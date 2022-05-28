package dataTypesEx;

import java.util.Scanner;

public class Ex06TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine()) + 96;
        for(int i = 97; i <= n; i++){
            for(int j = 97; j <= n; j++){
                for(int k = 97; k <= n; k++){
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }
    }
}
