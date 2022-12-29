package javaAdvancedExam;

import java.util.ArrayDeque;
import java.util.Arrays;

import java.util.Scanner;

public class Cooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] queue = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] stack = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<String> firstRow = new ArrayDeque<>();
        ArrayDeque<String> secondRow = new ArrayDeque<>();
        int breads = 0;
        int cakes = 0;
        int pastries = 0;
        int pies = 0;
        for(int num: queue){
            firstRow.offer("" + num);
        }
        for(int num: stack){
            secondRow.push("" + num);
        }
        while(!firstRow.isEmpty() && !secondRow.isEmpty()){
            int firstRowNum = Integer.parseInt(firstRow.poll());
            int secondRowNum = Integer.parseInt(secondRow.pop());
            int sum = firstRowNum + secondRowNum;
            switch (sum){
                case 25:
                    breads++;
                    break;
                case 50:
                    cakes++;
                    break;
                case 75:
                    pastries++;
                    break;
                case 100:
                    pies++;
                    break;
                default:
                    secondRow.push("" + (secondRowNum + 3));
                    break;
            }
        }
        if(breads > 0 && cakes >0 && pastries > 0 && pies > 0){
            System.out.println("Wohoo! You succeeded in cooking all the food!");
        } else{
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
        }
        System.out.print("Liquids left: ");
        if(firstRow.isEmpty()){
            System.out.println("none");
        } else{
            System.out.println(String.join(", ",  firstRow));
        }
        System.out.print("Ingredients left: ");
        if(secondRow.isEmpty()){
            System.out.println("none");
        } else{
            System.out.println(String.join(", ", secondRow));
        }
        System.out.println("Bread: " + breads);
        System.out.println("Cake: " + cakes);
        System.out.println("Fruit Pie: " + pies);
        System.out.println("Pastry: " + pastries);
    }
}
