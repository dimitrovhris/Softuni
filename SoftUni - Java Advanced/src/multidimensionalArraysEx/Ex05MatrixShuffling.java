package multidimensionalArraysEx;

import java.util.Arrays;
import java.util.Scanner;

public class Ex05MatrixShuffling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] data = sc.nextLine().split(" ");
        int rows = Integer.parseInt(data[0]);
        int cols = Integer.parseInt(data[1]);
        String[][] matrix = new String[rows][cols];
        for(int i = 0; i < rows; i++){
            matrix[i] = sc.nextLine().split(" ");
        }
        String input = sc.nextLine();
        while(!input.equals("END")){
            if(isInputValid(input, matrix)){
                String[] nums = input.split("\\s+");
                int num1 = Integer.parseInt(nums[1]);
                int num2 = Integer.parseInt(nums[2]);
                int num3 = Integer.parseInt(nums[3]);
                int num4 = Integer.parseInt(nums[4]);
                String num1ToSwap = matrix[num1][num2];
                String num2ToSwap = matrix[num3][num4];
                matrix[num3][num4] = num1ToSwap;
                matrix[num1][num2] = num2ToSwap;
                for(String[] array: matrix){
                    for(String num: array){
                        System.out.printf("%s ", num);
                    }
                    System.out.println();
                }
            } else{
                System.out.println("Invalid input!");
            }
            input = sc.nextLine();
        }
    }
    public static boolean isInputValid (String input, String[][] matrix){
        String[]data = input.split(" ");
        String word = data[0];
        if(!word.equals("swap") || data.length != 5){
            return false;
        }
        for(int i = 1; i < data.length; i++){
            if(i % 2 == 1){
                if(Integer.parseInt(data[i]) < 0 || Integer.parseInt(data[i]) > matrix.length){
                    return false;
                }
            } else{
                if(Integer.parseInt(data[i]) < 0 || Integer.parseInt(data[i]) > matrix[0].length){
                    return false;
                }
            }
        }
        return true;
    }
}
