package dataTypes;

import java.util.Scanner;

public class Ex05ContactName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstName = sc.nextLine();
        String secondName = sc.nextLine();
        String concatenate = sc.nextLine();
        System.out.printf("%s%s%s", firstName, concatenate, secondName);
    }
}
