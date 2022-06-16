package arraysEx;

import java.util.Scanner;

public class Ex10TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String chestItems = sc.nextLine();
        String input = sc.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] splitCommand = input.split(" ");
            String[] splitChest = chestItems.split("\\|");
            switch (splitCommand[0]) {
                case "Loot":
                    for (int i = 1; i <= splitCommand.length - 1; i++) {
                        boolean isValid = true;
                        for (String item : splitChest) {
                            if (item.equals(splitCommand[i])) {
                                isValid = false;
                            }
                        }
                        if (isValid)
                            chestItems = splitCommand[i] + "|" + chestItems ;
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(splitCommand[1]);
                    if (index < splitChest.length && index >= 0) {
                        String droppedItem = splitChest[index];
                        for (int i = index; i <= splitChest.length - 2; i++) {
                            splitChest[i] = splitChest[i + 1];
                        }
                        splitChest[splitChest.length - 1] = droppedItem;
                    }
                    chestItems = String.join("|", splitChest);
                    break;
                case "Steal":
                    int count = Integer.parseInt(splitCommand[1]);
                    if (count <= splitChest.length) {
                        for (int i = splitChest.length-count; i <= splitChest.length-1; i++) {
                            System.out.print(splitChest[i]);
                            splitChest[i] = "";
                            if(i != splitChest.length-1){
                                System.out.print(", ");
                            }
                        }
                    } else {
                        for (String item : splitChest) {
                            item = "";
                        }
                    }
                    System.out.println();
                    chestItems = String.join("|", splitChest);
                    break;
            }
            input = sc.nextLine();
        }
        int totalLength = 0;
        for (String item : chestItems.split("\\|")) {
            totalLength += item.length();
        }
        if (chestItems.split("\\|").length > 0) {
            double averageGain = 1.0 * totalLength / chestItems.split("\\|").length;
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageGain);
        } else {
            System.out.println("Failed treasure hunt.");
        }

    }
}
