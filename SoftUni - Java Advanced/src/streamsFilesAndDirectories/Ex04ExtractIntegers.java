package streamsFilesAndDirectories;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex04ExtractIntegers {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream inputStream = new FileInputStream("SoftUni - Java Advanced/resources/input.txt");
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                System.out.println(sc.nextInt());
            }
            else
            sc.next();
        }
    }
}
