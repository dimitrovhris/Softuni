package exExam7;

import java.util.Scanner;

public class exam75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int people = Integer.parseInt(sc.nextLine());
        int backs = 0;
        int chests = 0;
        int legs = 0;
        int abs = 0;
        int shakes = 0;
        int bars = 0;
        for(int i = 1; i <= people; i++){
            String input = sc.nextLine();
            switch(input){
                case"Back":
                    backs++;
                    break;
                case "Chest":
                    chests++;
                    break;
                case "Legs":
                    legs++;
                    break;
                case "Abs":
                    abs++;
                    break;
                case "Protein shake":
                    shakes++;
                    break;
                case "Protein bar":
                    bars++;
                    break;
            }
        }
        int totalWorkOuts = backs + chests + legs + abs;
        int totalProteins = shakes + bars;
        double percentWorkOuts = 1.0 * totalWorkOuts / people * 100;
        double percentProteins = 1.0 * totalProteins / people * 100;
        System.out.printf("%d - back%n", backs);
        System.out.printf("%d - chest%n", chests);
        System.out.printf("%d - legs%n", legs);
        System.out.printf("%d - abs%n", abs);
        System.out.printf("%d - protein shake%n", shakes);
        System.out.printf("%d - protein bar%n", bars);
        System.out.printf("%.2f%% - work out%n", percentWorkOuts);
        System.out.printf("%.2f%% - protein", percentProteins);
    }
}
