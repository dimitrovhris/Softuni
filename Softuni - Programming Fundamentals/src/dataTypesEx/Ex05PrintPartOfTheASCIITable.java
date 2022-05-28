package dataTypesEx;

import java.util.Scanner;

public class Ex05PrintPartOfTheASCIITable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int begin = Integer.parseInt(sc.nextLine());
        int end = Integer.parseInt(sc.nextLine());
        for(int i = begin; i <= end; i++){
            System.out.printf("%c ", i);
        }
    }
}
