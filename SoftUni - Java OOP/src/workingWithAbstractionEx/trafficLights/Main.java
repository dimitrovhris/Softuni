package workingWithAbstractionEx.trafficLights;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] trafficLights = sc.nextLine().split(" ");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= n; i++){
            changeLights(trafficLights);
        }
    }
    private static void changeLights (String[] trafficLights){
        for(int i = 0; i < trafficLights.length; i++){
            if(trafficLights[i].equals("YELLOW")){
                trafficLights[i] = "RED";
            } else if(trafficLights[i].equals("RED")){
                trafficLights[i] = "GREEN";
            } else{
                trafficLights[i] = "YELLOW";
            }
        }
        System.out.println(String.join(" ", trafficLights));
    }
}
