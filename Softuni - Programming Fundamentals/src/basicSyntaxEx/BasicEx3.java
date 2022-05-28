package basicSyntaxEx;

import java.util.Scanner;

public class BasicEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPeople = Integer.parseInt(sc.nextLine());
        String typeOfGroup = sc.nextLine();
        String day = sc.nextLine();
        double price;
        switch(day){
            case "Friday":
                if(typeOfGroup.equals("Students")){
                    price = 8.45;
                }
                else if(typeOfGroup.equals("Business")){
                    price = 10.90;
                }
                else{
                    price = 15;
                }
                break;
            case "Saturday":
                if(typeOfGroup.equals("Students")){
                    price = 9.80;
                }
                else if(typeOfGroup.equals("Business")){
                    price = 15.60;
                }
                else{
                    price = 20;
                }
                break;
            default:
                if(typeOfGroup.equals("Students")){
                    price = 10.46;
                }
                else if(typeOfGroup.equals("Business")){
                    price = 16;
                }
                else{
                    price = 22.50;
                }
        }
        double totalPrice = totalPeople * price;
        if (typeOfGroup.equals("Students") && totalPeople >= 30) {
            totalPrice -= 0.15 * totalPrice;
        }
        else if(typeOfGroup.equals("Business") && totalPeople >= 100){
            totalPrice -= 10 * price;
        }
        else if(typeOfGroup.equals("Regular") && totalPeople >= 10 && totalPeople <= 20){
            totalPrice -= 0.05 * totalPrice;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
