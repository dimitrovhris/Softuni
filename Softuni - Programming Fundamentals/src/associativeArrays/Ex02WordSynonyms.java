package associativeArrays;

import java.util.*;

public class Ex02WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, List<String>> words = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            if(!words.containsKey(word)){
                words.put(word, new ArrayList<>());
            }
            words.get(word).add(synonym);
        }
        for(Map.Entry<String, List<String>> entry: words.entrySet()){
            System.out.printf("%s - %s%n", entry.getKey(), String.join(", ", entry.getValue()));
        }
    }
}
