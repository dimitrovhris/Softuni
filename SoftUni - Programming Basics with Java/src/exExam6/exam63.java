package exExam6;

import java.util.Scanner;

public class exam63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        String device = sc.nextLine();
        double grade = 0;
        if(country.equals("Russia")){
            switch(device){
                case "ribbon":
                    grade = 18.5;
                    break;
                case "hoop":
                    grade = 19.1;
                    break;
                case "rope":
                    grade = 18.6;
                    break;
            }
        }
        else if(country.equals("Bulgaria")){
            switch(device){
                case "ribbon":
                    grade = 19;
                    break;
                case "hoop":
                    grade = 19.3;
                    break;
                case "rope":
                    grade = 18.9;
                    break;
            }
        }
        else{
            switch(device){
                case "ribbon":
                    grade = 18.7;
                    break;
                case "hoop":
                    grade = 18.8;
                    break;
                case "rope":
                    grade = 18.85;
                    break;
            }
        }
        double percent = (20 - grade) / 20 * 100;
        System.out.printf("The team of %s get %.3f on %s.%n", country, grade, device);
        System.out.printf("%.2f%%", percent);
    }
}
