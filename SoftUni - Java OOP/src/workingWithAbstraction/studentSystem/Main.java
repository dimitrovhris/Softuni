package workingWithAbstraction.studentSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentSystem studentSystem = new StudentSystem();
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while (!input.equals("Exit")) {
            String[] data = input.split(" ");
            if (data[0].equals("Exit")){
                break;
            }
            studentSystem.parseCommand(data);
            input = sc.nextLine();
        }
    }
}
