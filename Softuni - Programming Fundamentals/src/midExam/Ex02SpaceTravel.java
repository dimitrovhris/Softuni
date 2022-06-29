package midExam;

import java.util.Scanner;

public class Ex02SpaceTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] commands = sc.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(sc.nextLine());
        int ammunition = Integer.parseInt(sc.nextLine());
        for(int i = 0; i <= commands.length-1; i++){
            String command = commands[i].split(" ")[0];
            if ("Travel".equals(command)) {
                int lightYears = Integer.parseInt(commands[i].split(" ")[1]);
                if(lightYears > fuel){
                    System.out.println("Mission failed.");
                    break;
                }
                else{
                    System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                    fuel -= lightYears;
                }
            } else if ("Enemy".equals(command)) {
                int enemyPoints = Integer.parseInt(commands[i].split(" ")[1]);
                if (ammunition >= enemyPoints) {
                    ammunition -= enemyPoints;
                    System.out.printf("An enemy with %d armour is defeated.%n", enemyPoints);
                } else {
                    int runFuel = enemyPoints * 2;
                    if (fuel - runFuel >= 0) {
                        System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyPoints);
                    } else {
                        System.out.println("Mission failed.");
                        break;
                    }
                }
            } else if ("Repair".equals(command)) {
                int added = Integer.parseInt(commands[i].split(" ")[1]);
                fuel += added;
                ammunition += added * 2;
                System.out.printf("Ammunitions added: %d.%n", added * 2);
                System.out.printf("Fuel added: %d.%n", added);
            } else if ("Titan".equals(command)) {
                System.out.println("You have reached Titan, all passengers are safe.");
                break;
            }
        }
    }
}
