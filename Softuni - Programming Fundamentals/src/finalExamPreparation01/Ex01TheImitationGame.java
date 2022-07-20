package finalExamPreparation01;

import java.util.Scanner;

public class Ex01TheImitationGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder code = new StringBuilder();
        code.append(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("Decode")){
            String command = input.split("\\|")[0];
            switch(command){
                case "Move":
                    int numberOfLetters = Integer.parseInt(input.split("\\|")[1]);
                    code.append(code.substring(0, numberOfLetters));
                    code.delete(0, numberOfLetters);
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split("\\|")[1]);
                    String value = input.split("\\|")[2];
                    code.insert(index, value);
                    break;
                case "ChangeAll":
                    String substring = input.split("\\|")[1];
                    String placement = input.split("\\|")[2];
                    code.replace(0, code.length(), replacedCode(code, substring, placement));
                    break;
            }
            input = sc.nextLine();
        }
        System.out.printf("The decrypted message is: %s", code);
    }
    public static String replacedCode (StringBuilder code, String word, String placement){
        return code.toString().replace(word, placement);
    }
}
