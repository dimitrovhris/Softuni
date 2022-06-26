package midExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> cards = Arrays.stream(sc.nextLine().split(", ")).collect(Collectors.toList());
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            String command = input.split(", ")[0];
            String cardName = input.split(", ")[1];
            switch(command){
                case "Add":
                    if(cards.contains(cardName)){
                        System.out.println("Card is already in the deck");
                    }
                    else{
                        cards.add(cardName);
                        System.out.println("Card successfully added");
                    }
                    break;
                case "Remove":
                    if(cards.contains(cardName)){
                        cards.remove(cardName);
                        System.out.println("Card successfully removed");
                    }
                    else{
                        System.out.println("Card not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(cardName);
                    if(index >= 0 && index <= cards.size()-1){
                        cards.remove(index);
                        System.out.println("Card successfully removed");
                    }
                    else{
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int index2 = Integer.parseInt(cardName);
                    String cardName2 = input.split(", ")[2];
                    if(index2 >= 0 && index2 <= cards.size()-1){
                        if(cards.contains(cardName2)){
                            System.out.println("Card is already added");
                        }
                        else{
                            cards.add(index2, cardName2);
                            System.out.println("Card successfully added");
                        }
                    }
                    else{
                        System.out.println("Index out of range");
                    }
            }
        }
        for(int i = 0; i <= cards.size()-2; i++){
            System.out.printf("%s, ", cards.get(i));
        }
        System.out.printf("%s", cards.get(cards.size()-1));
    }
}
