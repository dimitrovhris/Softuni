package basicSynatx;

import java.util.Scanner;

public class Basic7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String typeOfDay = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String price = "";
        if(age >= 0 && age <= 18) {
            switch (typeOfDay) {
                case "Weekday":
                    price = "12$";
                    break;
                case "Weekend":
                    price = "15$";
                    break;
                case "Holiday":
                    price = "5$";
                    break;
            }
        }
        else if(age <= 64 && age > 18){
            switch (typeOfDay) {
                case "Weekday":
                    price = "18$";
                    break;
                case "Weekend":
                    price = "20$";
                    break;
                case "Holiday":
                    price = "12$";
                    break;
            }
        }
        else if(age <= 122 && age > 64){
            switch (typeOfDay) {
                case "Weekday":
                    price = "12$";
                    break;
                case "Weekend":
                    price = "15$";
                    break;
                case "Holiday":
                    price = "10$";
                    break;
            }
        }
        else{
            price = "Error!";
        }
        System.out.println(price);
    }
}
