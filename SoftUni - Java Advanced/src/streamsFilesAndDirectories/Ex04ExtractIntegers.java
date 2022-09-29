package streamsFilesAndDirectories;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ex04ExtractIntegers {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("SoftUni - Java Advanced/resources/input.txt");
        PrintWriter printWriter = new PrintWriter("SoftUni - Java Advanced/resources/04.ExtractIntegersOutput.txt");
        Scanner sc = new Scanner(inputStream);
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                printWriter.println(sc.nextInt());
            }
            else
            sc.next();
        }
        inputStream.close();
        printWriter.close();
    }
}
