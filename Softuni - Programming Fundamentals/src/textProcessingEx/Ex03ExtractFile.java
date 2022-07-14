package textProcessingEx;

import java.util.Scanner;

public class Ex03ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("\\\\");
        String[] file = input[input.length-1].split("\\.");
        String fileName = file[0];
        String extension = file[1];
        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
