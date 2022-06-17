package lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String input = sc.nextLine();
        while (!input.equals("end")) {
            String command = input.split(" ")[0];
            switch (command){
                case "Contains":
                    int num = Integer.parseInt(input.split(" ")[1]);
                    if(numbers.contains(num)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No such number");
                    }
                    break;
                case "Print":
                    switch(input.split(" ")[1]){
                        case "even":
                          for(int i = 0; i <= numbers.size()-1; i++){
                              if(numbers.get(i) % 2 == 0){
                                  System.out.printf("%d ", numbers.get(i));
                              }
                          }
                          break;
                        default:
                            for(int i = 0; i <= numbers.size()-1; i++){
                                if(numbers.get(i) % 2 == 1){
                                    System.out.printf("%d ", numbers.get(i));
                                }
                            }
                    }
                    System.out.println();
                    break;
                case "Get":
                    int sum = 0;
                    for(int i = 0; i <= numbers.size()-1; i++){
                        sum += numbers.get(i);
                    }
                    System.out.println(sum);
                break;
                case "Filter":
                    int compareNum= Integer.parseInt(input.split(" ")[2]);
                    for(int i = 0; i <= numbers.size()-1; i++){
                        switch(input.split(" ")[1]){
                            case "<":
                                if(numbers.get(i) < compareNum){
                                    System.out.printf("%d ", numbers.get(i));
                                }
                                break;
                            case "<=":
                                if(numbers.get(i) <= compareNum){
                                    System.out.printf("%d ", numbers.get(i));
                                }
                                break;
                            case ">":
                                if(numbers.get(i) > compareNum){
                                    System.out.printf("%d ", numbers.get(i));
                                }
                                break;
                            case ">=":
                                if(numbers.get(i) >= compareNum){
                                    System.out.printf("%d ", numbers.get(i));
                                }
                                break;
                        }
                    }
                    System.out.println();
                    break;
            }
            input = sc.nextLine();
        }
    }
}
