package finalExam;

import java.util.*;

public class Ex03WildZoo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<String>> records = new LinkedHashMap<>();
        List<String> areas = new ArrayList<>();
        String input = sc.nextLine();
        while(!input.equals("EndDay")){
            String[] splitCommand = input.split(": ");
            String command = splitCommand[0];
            String animalName = splitCommand[1].split("-")[0];
            int food = Integer.parseInt(splitCommand[1].split("-")[1]);
            switch (command){
                case "Add":
                    String area = splitCommand[1].split("-")[2];
                    if(!records.containsKey(animalName)){
                        records.put(animalName, new ArrayList<>());
                        records.get(animalName).add("" + food);
                        records.get(animalName).add(area);
                        if(!areas.contains(area))
                        areas.add(area);
                    }
                    else{
                        int newFood = Integer.parseInt(records.get(animalName).get(0)) + food;
                        records.get(animalName).set(0, "" + newFood);
                    }
                    break;
                case "Feed":
                    if(records.containsKey(animalName)){
                        int reducedFood = Integer.parseInt(records.get(animalName).get(0)) - food;
                        if(reducedFood <= 0){
                            records.remove(animalName);
                            System.out.printf("%s was successfully fed%n", animalName);
                        }
                        else{
                            records.get(animalName).set(0, "" + reducedFood);
                        }
                    }
                    break;
            }
            input = sc.nextLine();
        }
        System.out.println("Animals:");
        for (Map.Entry<String, List<String>> entry : records.entrySet()) {
            System.out.printf(" %s -> %sg%n", entry.getKey(), entry.getValue().get(0));
        }
        System.out.println("Areas with hungry animals:");
        for(String area: areas){
            int currentHungryAnimals = 0;
            for (Map.Entry<String, List<String>> entry : records.entrySet()) {
                String currentArea = entry.getValue().get(1);
                if(area.equals(currentArea)){
                    currentHungryAnimals++;
                }

            }
            if(currentHungryAnimals != 0)
                System.out.printf("%s: %d%n", area, currentHungryAnimals);
        }
    }
}
