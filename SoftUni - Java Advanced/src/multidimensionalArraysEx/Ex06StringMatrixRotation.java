package multidimensionalArraysEx;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex06StringMatrixRotation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(command);
        int degree = 0;
        if (matcher.find()) {
            degree = Integer.parseInt(matcher.group());
        }
        int maxCol = Integer.MIN_VALUE;
        List<String> words = new ArrayList<>();
        int rows = 0;
        String input = sc.nextLine();
        while (!input.equals("END")) {
            words.add(input);
            if (input.length() > maxCol) {
                maxCol = input.length();
            }
            rows++;
            input = sc.nextLine();
        }
        String[][] matrix = new String[rows][maxCol];
        for (int i = 0; i < matrix.length; i++) {
            String[] split = words.get(i).split("");
            for (int j = 0; j < split.length; j++) {
                matrix[i][j] = split[j];
            }
        }
        if (degree % 360 == 0) {
            print(matrix);
        } else if (degree % 270 == 0) {
            int times = degree / 270;
            String[][] matrix270 = new String[matrix[0].length][matrix.length];
            for (int k = 1; k <= times; k++) {
                for (int i = 0; i < matrix270.length; i++) {
                    int row270 = matrix270.length - 1;
                    for (int j = 0; j < matrix[i].length; j++) {
                        matrix270[row270][i] = matrix[i][j];
                        row270--;
                    }
                }
            }
            print(matrix270);
        } else if (degree % 180 == 0) {
            String[][] matrix180 = new String[matrix.length][matrix[0].length];
            int row = matrix.length - 1;
            for (int i = 0; i < matrix.length; i++) {
                int col180 = matrix[0].length - 1;
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix180[row][col180] = matrix[i][j];
                    col180--;
                }
                row--;
            }
            print(matrix180);
        } else {
            int col90 = matrix.length - 1;
            String[][] matrix90 = new String[matrix[0].length][matrix.length];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix90[j][col90] = matrix[i][j];
                }
                col90--;
            }
            print(matrix90);
        }

    }


    public static void print(String[][] matrix) {
        for (String[] array : matrix) {
            for (String letter : array) {
                if (letter != null) {
                    System.out.printf("%s", letter);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
