package setsAndMaps;

import java.util.*;
import java.util.stream.Collectors;

public class Ex03VoinaNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> firstDeck = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> secondDeck = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        int rounds = 50;
        while(rounds-- > 0){
            int firstCard = firstDeck.iterator().next();
            firstDeck.remove(firstCard);

            int secondCard = secondDeck.iterator().next();
            secondDeck.remove(secondCard);
            if(firstCard > secondCard){
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if(firstCard < secondCard){
                secondDeck.add(firstCard);
                secondDeck.add(secondCard);
            }
        }
        if(firstDeck.size() > secondDeck.size()){
            System.out.println("First player win!");
        } else if(firstDeck.size() < secondDeck.size()){
            System.out.println("Second player win!");
        } else{
            System.out.println("Draw!");
        }
    }
}
