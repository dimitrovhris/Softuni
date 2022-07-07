package associativeArrays;

import java.util.*;
import java.util.stream.Collectors;

public class Ex03OddOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().toLowerCase().split(" ");
        HashMap<String, Integer> words = new LinkedHashMap<>();
        for(String item: input){
            if(!words.containsKey(item)){
                words.put(item, 1);
            }
            else{
                words.put(item, words.get(item) + 1);
            }
        }
        List<String> odds = new ArrayList<>();
        for(Map.Entry<String, Integer> entry: words.entrySet()){
            if(entry.getValue() % 2 != 0){
                odds.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", odds));
    }
}
