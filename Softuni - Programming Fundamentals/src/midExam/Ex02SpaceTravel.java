package midExam;

import java.util.Scanner;

public class Ex02SpaceTravel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] commands = sc.nextLine().split("\\|\\|");
        int fuel = Integer.parseInt(sc.nextLine());
        int ammunition = Integer.parseInt(sc.nextLine());
        boolean missionFailed = false;
        for(int i = 0; i <= commands.length-1; i++){
            String command = commands[i].split(" ")[0];
            switch(command){
                case "Travel":
                    int lightYears = Integer.parseInt(commands[i].split(" ")[1]);
                    if(fuel >= lightYears){
                        fuel -= lightYears;
                        System.out.printf("The spaceship travelled %d light-years.%n", lightYears);
                    }
                    else{
                        System.out.println("Mission failed.");
                        missionFailed = true;
                    }
                    break;
                case "Enemy":
                    int enemyPoints = Integer.parseInt(commands[i].split(" ")[1]);
                    if(ammunition >= enemyPoints){
                        ammunition -= enemyPoints;
                        System.out.printf("An enemy with %d armour is defeated.%n", enemyPoints);
                    }
                    else{
                        int runFuel = enemyPoints * 2;
                        if(fuel - runFuel >= 0){
                            System.out.printf("An enemy with %d armour is outmaneuvered.%n", enemyPoints);
                        }
                        else{
                            System.out.println("Mission failed.");
                            missionFailed = true;
                        }
                    }
                    break;
                case "Repair":
                    int added = Integer.parseInt(commands[i].split(" ")[1]);
                    fuel += added;
                    ammunition += added * 2;
                    System.out.printf("Ammunitions added: %d.%n", added * 2);
                    System.out.printf("Fuel added: %d.%n", added);
                    break;
                case "Titan":
                    System.out.println("You have reached Titan, all passengers are safe.");
            }
            if(missionFailed){
                break;
            }
        }
    }
}
