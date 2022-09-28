package streamsFilesAndDirectories;


import java.io.*;

public class Ex03CopyBytes {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("SoftUni - Java Advanced/resources/input.txt");
        FileOutputStream outputStream = new FileOutputStream("SoftUni - Java Advanced/resources/03.CopyBytesOutput.txt");
        int bytes = inputStream.read();
        while(bytes >= 0){
            if((char) bytes == ' '){
                outputStream.write(' ');
            } else if((char) bytes == '\n'){
                outputStream.write('\n');
            } else{
                String num = String.valueOf(bytes);
                for(int i = 0; i < num.length(); i++){
                    outputStream.write(num.charAt(i));
                }
            }
            bytes = inputStream.read();
        }
    }
}