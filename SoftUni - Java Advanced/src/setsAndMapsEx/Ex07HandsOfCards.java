package setsAndMapsEx;

import java.util.*;

public class Ex07HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> players = new LinkedHashMap<>();
        String input = sc.nextLine();
        while(!input.equals("JOKER")){
            String[] data = input.split(": ");
            String name = data[0];
            if(!players.containsKey(name)){
                players.put(name, new HashSet<>());
            }
            Collections.addAll(players.get(name), data[1].split(", "));
            input = sc.nextLine();
        }
        for (Map.Entry<String, Set<String>> entry : players.entrySet()) {
            int totalSum = 0;
            for(String card: entry.getValue()){
                int num1;
                int num2;
                char cardNum = card.charAt(0);
                char cardType = card.charAt(card.length()-1);
                if(cardNum == 'J'){
                    num1 = 11;
                } else if(cardNum == 'Q'){
                    num1 = 12;
                } else if(cardNum == 'K'){
                    num1 = 13;
                } else if(cardNum == 'A'){
                    num1 = 14;
                } else if(cardNum == '1'){
                    num1 = 10;
                } else{
                    num1 = Integer.parseInt("" + cardNum);
                }
                if(cardType == 'S'){
                    num2 = 4;
                } else if(cardType == 'H'){
                    num2 = 3;
                } else if(cardType == 'D'){
                    num2 = 2;
                } else{
                    num2 = 1;
                }
                totalSum += num1 * num2;
            }
            System.out.printf("%s: %d%n", entry.getKey(), totalSum);
        }
    }
}
