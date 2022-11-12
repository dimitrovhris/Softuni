package workingWithAbstraction.exercise.workingWithAbstractionEx.cardSuit;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input + ":");
        for (CardSuits value : CardSuits.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.getValue(), value.getName());
        }
    }
}
