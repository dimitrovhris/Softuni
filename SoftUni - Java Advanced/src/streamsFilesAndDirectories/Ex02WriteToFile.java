package streamsFilesAndDirectories;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Ex02WriteToFile {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("SoftUni - Java Advanced/resources/input.txt");
        FileOutputStream outputStream = new FileOutputStream("SoftUni - Java Advanced/resources/02.WriteToFileOutput.txt");
        List<Character> charactersToSkip = Arrays.asList('?', ',', '!', '.');
        int currentByte = inputStream.read();
        while(currentByte >= 0){
            char currentChar = (char)currentByte;
            if(!charactersToSkip.contains(currentChar))
            outputStream.write(currentChar);
            currentByte = inputStream.read();
        }
    }
}
