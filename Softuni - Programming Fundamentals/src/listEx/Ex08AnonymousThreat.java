package listEx;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex08AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> info = Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("3:1")) {
            String command = input.split(" ")[0];
            int num1 = Integer.parseInt(input.split(" ")[1]);
            int num2 = Integer.parseInt(input.split(" ")[2]);
            switch (command) {
                case "merge":
                    String mergedText = "";
                    if (num1 < 0) {
                        num1 = 0;
                    }
                    if (num2 > info.size() - 1) {
                        num2 = info.size() - 1;
                    }
                    for (int i = num1; i < num2; i++) {
                        String currentMerge = info.get(i) + info.get(i + 1);
                        info.set(i, currentMerge);
                        info.remove(i + 1);
                        i = num1 - 1;
                        num2--;
                    }
                    break;
                case "divide":
                    String wordToDivide = info.get(num1);
                    info.remove(num1);
                    int index = num1;
                    int whiteSpaces = wordToDivide.length() / num2;
                    int startSubstring = 0;
                    for(int i = 1; i <= num2-1; i++){
                        info.add(index, wordToDivide.substring(startSubstring, startSubstring+ whiteSpaces));
                        index++;
                        startSubstring += whiteSpaces;
                    }
                    info.add(wordToDivide.substring(index));
                    break;
            }
            input = sc.nextLine();
        }
        for(String item : info){
            System.out.printf("%s ", item);
        }
    }
}
