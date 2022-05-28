package loopsEx;
import java.util.Scanner;
public class MoreLoops3 {
    public static void main(String[] args) {
        Scanner readData = new Scanner (System.in);

        int loads = Integer.parseInt(readData.nextLine());
        double totalSum = 0;

        double microbusTones = 0;
        double truckTones = 0;
        double trainTones = 0;
        double totalTones = 0;
        double averageForTone = 0;



        for(int i =1; i<= loads; i++){
            int tones = Integer.parseInt(readData.nextLine());
            if(tones <= 3){
                totalSum = totalSum + tones * 200;
                microbusTones = microbusTones + tones;
            }else if (tones < 11){
                totalSum = totalSum + tones * 175;
                truckTones = truckTones+ tones;
            }else {
                totalSum = totalSum + tones * 120;
                trainTones = trainTones + tones;
            }


        }
        totalTones = microbusTones + truckTones + trainTones;
        averageForTone = totalSum / totalTones;
        double microbusPercent = microbusTones/totalTones * 100;
        double truckPercent = truckTones/totalTones * 100;
        double trainPercent = trainTones/totalTones * 100;

        System.out.printf("%.2f\n", averageForTone);
        System.out.printf("%.2f%%\n", microbusPercent);
        System.out.printf("%.2f%%\n", truckPercent);
        System.out.printf("%.2f%%\n", trainPercent);


    }
}
