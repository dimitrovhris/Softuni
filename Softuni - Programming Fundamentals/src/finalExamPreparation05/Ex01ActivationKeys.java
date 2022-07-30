package finalExamPreparation05;

import java.util.Scanner;

public class Ex01ActivationKeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder key = new StringBuilder();
        key.append(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Generate")) {
            String[] splitInput = input.split(">>>");
            String command = splitInput[0];
            switch (command) {
                case "Contains":
                    String substring = splitInput[1];
                    if (key.toString().contains(substring)) {
                        System.out.printf("%s contains %s%n", key, substring);
                    } else {
                        System.out.println("Substring not found!");
                    }
                    break;
                case "Flip":
                    String typeOfLetter = splitInput[1];
                    int startIndex = Integer.parseInt(splitInput[2]);
                    int endIndex = Integer.parseInt(splitInput[3]);
                    StringBuilder subWord = new StringBuilder();
                    for (int i = startIndex; i < endIndex; i++) {
                        if (typeOfLetter.equals("Lower")) {
                            subWord.append(Character.toLowerCase(key.charAt(i)));
                        }
                        else {
                            subWord.append(Character.toUpperCase(key.charAt(i)));
                        }
                    }
                    key.replace(startIndex, endIndex, subWord.toString());
                    System.out.println(key);
                    break;
                case "Slice":
                    int startIndexRemove = Integer.parseInt(splitInput[1]);
                    int endIndexRemove = Integer.parseInt(splitInput[2]);
                    key.delete(startIndexRemove, endIndexRemove);
                    System.out.println(key);
            }
            input = sc.nextLine();
        }
        System.out.printf("Your activation key is: %s", key);
    }
}
