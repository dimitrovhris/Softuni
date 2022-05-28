package nestedLoops;

import java.util.Scanner;

public class NestedLoop7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String movie = sc.nextLine();

        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        while(!movie.equals("Finish")){
            int totalSeats = Integer.parseInt(sc.nextLine());
            int counter = 0;
            for(int i = 0; i < totalSeats; i++){
                String ticketType = sc.nextLine();
                if(ticketType.equals("End")){
                    break;
                }
                counter++;
                switch(ticketType){
                    case "student" -> studentTickets++;
                    case "standard" -> standardTickets++;
                    case "kid" -> kidTickets++;
                }
            }
            double percentOfHall = 1.0 * counter / totalSeats * 100;
            System.out.printf("%s - %.2f%% full.%n", movie, percentOfHall);
            movie = sc.nextLine();
        }
        int totalTickets = standardTickets + studentTickets + kidTickets;
        System.out.printf("Total tickets: %d%n", totalTickets);
        double studentPercent = 1.0 * studentTickets / totalTickets * 100;
        double standardPercent = 1.0 * standardTickets / totalTickets * 100;
        double kidPercent = 1.0 * kidTickets / totalTickets * 100;
        System.out.printf("%.2f%% student tickets%n", studentPercent);
        System.out.printf("%.2f%% standard tickets%n", standardPercent);
        System.out.printf("%.2f%% kids tickets%n",kidPercent);
    }
}
