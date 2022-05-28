package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String correctPassword = "";
        for(int i = username.length()-1; i >= 0; i--){
            correctPassword += username.charAt(i);
        }
        String input = sc.nextLine();
        int tries = 1;
        while(!input.equals(correctPassword)){
            if(tries != 4){
                System.out.println("Incorrect password. Try again.");
            }
            else{
                System.out.printf("User %s blocked!", username);
                break;
            }
            input = sc.nextLine();
            tries++;
        }
        if(input.equals(correctPassword)){
            System.out.printf("User %s logged in.", username);
        }
    }
}
