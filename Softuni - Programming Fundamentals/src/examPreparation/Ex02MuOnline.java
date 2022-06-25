package examPreparation;

import java.util.Scanner;

public class Ex02MuOnline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] rooms = sc.nextLine().split("\\|");
        int health = 100;
        int bitcoins = 0;
        boolean died = false;
        for(int i = 0; i <= rooms.length-1; i++){
            String command = rooms[i].split(" ")[0];
            int num = Integer.parseInt(rooms[i].split(" ")[1]);
            switch (command){
                case "potion":
                    int currentHealth = health;
                    health += num;
                    if(health > 100){
                        health = 100;
                        num = 100 - currentHealth;
                    }
                    System.out.printf("You healed for %d hp.%n", num);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += num;
                    System.out.printf("You found %d bitcoins.%n", num);
                    break;
                default:
                    health -= num;
                    if(health > 0){
                        System.out.printf("You slayed %s.%n", command);
                    }
                    else{
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d", i + 1);
                        died = true;
                    }
                    break;
            }
            if(died)
                break;
        }
        if(!died){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}
