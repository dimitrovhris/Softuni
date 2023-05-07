package fundExam;

import java.util.Scanner;

public class Ex1ComputerStore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        double totalSum = 0;
        while(!command.equals("special") && !command.equals("regular")){
            double current = Double.parseDouble(command);
            if(current <= 0){
                System.out.println("Invalid price!");
            } else {
                totalSum += current;
            }
            command = sc.nextLine();
        }
        double realTotalSum = totalSum += 0.2 * totalSum;
        if(command.equals("special")){
            realTotalSum -= 0.10 * realTotalSum;
        }
        if(totalSum == 0){
            System.out.println("Invalid order!");
        } else{
            System.out.println("Congratulations you've just bought a new computer!");
        }
    }
}
