package basicSynatx;

import java.util.Scanner;

public class Basic5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String month = "";
        switch(num){
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
            case 11:
                month = "November";
                break;
            case 12:
                month = "December";
                break;
            default:
                month = "Error!";
        }
        System.out.println(month);
    }
}
