package streamsFilesAndDirectories;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Ex06SortLines {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("SoftUni - Java Advanced/resources/input.txt");
        PrintWriter printWriter = new PrintWriter("SoftUni - Java Advanced/resources/06.SortLinesOutput.txt");
        List<String> lines = Files.readAllLines(path);
        Collections.sort(lines);
        for(String line: lines){
            printWriter.println(line);
        }
        printWriter.close();
    }
}
