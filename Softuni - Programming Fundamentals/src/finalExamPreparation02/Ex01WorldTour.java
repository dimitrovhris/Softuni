package finalExamPreparation02;

import java.util.Scanner;

public class Ex01WorldTour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputString = new StringBuilder();
        inputString.append(sc.nextLine());
        String command = sc.nextLine();
        while (!command.equals("Travel")) {
            switch (command.charAt(0)) {
                case 'A':
                    int index = Integer.parseInt(command.split(":")[1]);
                    if (index >= 0 && index <= inputString.length() - 1) {
                        String string = command.split(":")[2];
                        inputString.insert(index, string);
                    }
                    break;
                case 'R':
                    int startIndex = Integer.parseInt(command.split(":")[1]);
                    int endIndex = Integer.parseInt(command.split(":")[2]);
                    if (startIndex >= 0 && startIndex <= inputString.length() - 1 && endIndex >= 0 && endIndex <= inputString.length() - 1) {
                        inputString.delete(startIndex, endIndex + 1);
                    }
                    break;
                case 'S':
                    String oldString = command.split(":")[1];
                    String newString = command.split(":")[2];
                    inputString.replace(0, inputString.length(), inputString.toString().replaceAll(oldString, newString));
                    break;
            }
            System.out.println(inputString);
            command = sc.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s", inputString);
    }
}
