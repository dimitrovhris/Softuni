package listEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex03HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List <String> partyNames = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String command = sc.nextLine();
            String name = command.split(" ")[0];
            switch(command.split(" ")[2]){
                case "not":
                    if(partyNames.contains(name))
                    partyNames.removeIf(e -> e.equals(name));
                    else{
                        System.out.printf("%s is not in the list!%n", name);
                    }
                    break;
                default:
                    if(partyNames.contains(name)){
                        System.out.printf("%s is already in the list!%n", name);
                    }
                    else{
                        partyNames.add(name);
                    }
            }
        }
        for(String guest: partyNames){
            System.out.println(guest);
        }
    }
}
