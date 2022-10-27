package workingWithAbstractionEx.cardRank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine() + ":");
        for (CardRank value : CardRank.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", value.getValue(), value.getName());
        }
    }
}
