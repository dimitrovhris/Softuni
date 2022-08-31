package revision;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex03MemoryGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> sequence = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        int moves = 1;
        String input = sc.nextLine();
        while (!input.equals("end")) {
            int index1 = Integer.parseInt(input.split(" ")[0]);
            int index2 = Integer.parseInt(input.split(" ")[1]);
            if (index1 < 0 || index2 < 0 || index1 >= sequence.size() || index2 >= sequence.size() || index1 == index2) {
                int middle = sequence.size() / 2;
                sequence.add(middle, "-" + moves + "a");
                sequence.add(middle + 1, "-" + moves + "a");
                System.out.println("Invalid input! Adding additional elements to the board");
            }
            else if (sequence.get(index1).equals(sequence.get(index2))) {
                System.out.printf("Congrats! You have found matching elements - %s!%n", sequence.get(index1));
                String currentElement = sequence.get(index1);
                sequence.remove(index1);
                sequence.remove(currentElement);
            } else {
                System.out.println("Try again!");
            }
            if (sequence.isEmpty()) {
                System.out.printf("You have won in %d turns!%n", moves);
                break;
            }
            moves++;
            input = sc.nextLine();
        }
        if (!sequence.isEmpty()) {
            System.out.println("Sorry you lose :(");
            for (String element : sequence) {
                System.out.printf("%s ", element);
            }
        }
    }
}
