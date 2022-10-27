package workingWithAbstractionEx.cardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rank = sc.nextLine();
        String suit = sc.nextLine();
        CardRank cardRank = CardRank.valueOf(rank);
        CardSuit cardSuit = CardSuit.valueOf(suit);
        System.out.printf("Card name: %s of %s; Card power: %d%n", rank, suit, cardRank.getValue() + cardSuit.getValue());
    }
}
