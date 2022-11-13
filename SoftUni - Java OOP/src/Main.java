import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] carData = sc.nextLine().split(" ");
        String[] truckData = sc.nextLine().split(" ");
        double carQuantity = Double.parseDouble(carData[1]);
        double carConsumption = Double.parseDouble(carData[2]);
        double truckQuantity = Double.parseDouble(truckData[1]);
        double truckConsumption = Double.parseDouble(truckData[2]);
        Vehicle car = new Car(carQuantity, carConsumption);
        Vehicle truck = new Truck(truckQuantity, truckConsumption);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            String[] commandData = sc.nextLine().split(" ");
            String number = commandData[2];
            switch(commandData[0]){
                case "Drive":
                    if(commandData[1].equals("Car")){
                        System.out.println(car.drive(number));
                    } else{
                        System.out.println(truck.drive(number));
                    }
                    break;
                default:
                    if(commandData[1].equals("Car")){
                        car.refuel(Double.parseDouble(number));
                    } else{
                        truck.refuel(Double.parseDouble(number));
                    }
                    break;
            }
        }
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.printf("Car: %.2f%n", car.getFuelQuantity());
        System.out.printf("Truck: %.2f", (truck.getFuelQuantity()));
    }
}
