package finalExam;

import java.util.Scanner;

public class Ex01Hogwarts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder spell = new StringBuilder();
        spell.append(sc.nextLine());
        String input = sc.nextLine();
        while(!input.equals("Abracadabra")){
            String command = input.split(" ")[0];
            switch(command){
                case "Abjuration":
                    String upperWord = spell.toString().toUpperCase();
                    spell.replace(0, spell.length(), upperWord);
                    System.out.println(spell);
                    break;
                case "Necromancy":
                    String lowerWord = spell.toString().toLowerCase();
                    spell.replace(0, spell.length(), lowerWord);
                    System.out.println(spell);
                    break;
                case "Illusion":
                    int index = Integer.parseInt(input.split(" ")[1]);
                    if(index >= 0 && index <= spell.length()-1){
                        char letter = input.split(" ")[2].charAt(0);
                        spell.setCharAt(index, letter);
                        System.out.println("Done!");
                    }
                    else{
                        System.out.println("The spell was too weak.");
                    }
                    break;
                case "Divination":
                    String firstSubstring = input.split(" ")[1];
                    String secondSubstring = input.split(" ")[2];
                    if(spell.toString().contains(firstSubstring)){
                        String replacedSpell = spell.toString().replace(firstSubstring, secondSubstring);
                        spell.delete(0, spell.length());
                        spell.append(replacedSpell);
                        System.out.println(spell);
                    }
                    break;
                case "Alteration":
                    String substring = input.split(" ")[1];
                    if(spell.toString().contains(substring)){
                        int firstIndex = spell.indexOf(substring);
                        int lastIndex = firstIndex + substring.length();
                        spell.delete(firstIndex, lastIndex);
                        System.out.println(spell);
                    }
                    break;
                default:
                    System.out.println("The spell did not work!");
                    break;
            }
            input = sc.nextLine();
        }
    }
}
