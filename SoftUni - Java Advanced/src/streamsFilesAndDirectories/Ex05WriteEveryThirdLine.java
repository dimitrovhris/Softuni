package streamsFilesAndDirectories;

import java.io.*;
import java.util.Scanner;

public class Ex05WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new FileReader("SoftUni - Java Advanced/resources/input.txt"));
        PrintWriter writer = new PrintWriter("SoftUni - Java Advanced/resources/05.WriteEveryThirdLineOutput.txt");
        String line = reader.readLine();
        int lineCounter = 1;
        while(line != null){
            if(lineCounter % 3 == 0){
                writer.println(line);
            }
            lineCounter++;
            line = reader.readLine();
        }
        reader.close();
        writer.close();
    }
}
