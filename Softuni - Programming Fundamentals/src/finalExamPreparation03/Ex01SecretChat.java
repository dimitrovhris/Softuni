package finalExamPreparation03;

import java.util.Scanner;

public class Ex01SecretChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder message = new StringBuilder();
        message.append(sc.nextLine());
        String input = sc.nextLine();
        while (!input.equals("Reveal")) {
            String command = input.split(":\\|:")[0];
            boolean error = false;
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(input.split(":\\|:")[1]);
                    message.insert(index, " ");
                    break;
                case "Reverse":
                    StringBuilder substring = new StringBuilder();
                    substring.append(input.split(":\\|:")[1]);
                    if (message.toString().contains(substring)) {
                        String newMessage = message.toString().replaceFirst(substring.toString(), "");
                        String reversedSubstring = substring.reverse().toString();
                        message.setLength(0);
                        message.append(newMessage).append(reversedSubstring);
                    }
                    else{
                        error = true;
                        System.out.println("error");
                    }
                    break;
                case "ChangeAll":
                    String substringToReplace = input.split(":\\|:")[1];
                    String replacement = input.split(":\\|:")[2];
                    String replacedText = message.toString().replaceAll(substringToReplace, replacement);
                    message.setLength(0);
                    message.append(replacedText);
                    break;
            }
            if(!error)
            System.out.println(message);
            input = sc.nextLine();
        }
        System.out.printf("You have a new text message: %s", message);
    }
}
