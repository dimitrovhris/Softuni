package finalExamPreparation01;

import java.util.*;

public class Ex03ThePianist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> info = new LinkedHashMap<>();
        for(int i = 1; i <= n; i++){
            String input = sc.nextLine();
            String piece = input.split("\\|")[0];
            String composer = input.split("\\|")[1];
            String key = input.split("\\|")[2];
            info.put(piece, new ArrayList<>());
            info.get(piece).add(composer);
            info.get(piece).add(key);
        }
        String input = sc.nextLine();
        while (!input.equals("Stop")) {
            String command = input.split("\\|")[0];
            String piece = input.split("\\|")[1];
            switch (command) {
                case "Add":
                    String composer = input.split("\\|")[2];
                    String key = input.split("\\|")[3];
                    if (!info.containsKey(piece)) {
                        info.put(piece, new ArrayList<>());
                        info.get(piece).add(composer);
                        info.get(piece).add(key);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    else{
                        System.out.printf("%s is already in the collection!%n", piece);
                    }
                    break;
                case "Remove":
                    if(info.containsKey(piece)){
                        info.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    }
                    else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    if(info.containsKey(piece)){
                        String newKey = input.split("\\|")[2];
                        info.get(piece).set(1, newKey);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    }
                    else{
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }

            }
            input = sc.nextLine();
        }
        for (Map.Entry<String, List<String>> entry : info.entrySet()) {
            System.out.printf("%s -> ", entry.getKey());
            System.out.printf("Composer: %s, Key: %s%n", entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
