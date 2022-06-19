package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex06CardsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> deck1 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> deck2 = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        for(int i = 0; i <= deck1.size()-1; i++){
            if(deck1.isEmpty() || deck2.isEmpty()){
                break;
            }
            int card1 = deck1.get(i);
            int card2 = deck2.get(i);
            if(card1 > card2){
                deck1.add(card1);
                deck1.add(card2);
                deck1.remove(0);
                deck2.remove(0);
                i = -1;
            }
            else if (card1 < card2){
                deck2.add(card2);
                deck2.add(card1);
                deck2.remove(0);
                deck1.remove(0);
                i = -1;
            }
            else{
                deck1.remove(i);
                deck2.remove(i);
                i = -1;
            }
        }
        if(deck1.isEmpty()){
            System.out.printf("Second player wins! Sum: %d", calculateSum(deck2));
        }
        else{
            System.out.printf("First player wins! Sum: %d", calculateSum(deck1));
        }
    }
    public static int calculateSum(List<Integer> deck){
        int sum = 0;
        for(int num : deck){
            sum += num;
        }
        return sum;
    }
}
