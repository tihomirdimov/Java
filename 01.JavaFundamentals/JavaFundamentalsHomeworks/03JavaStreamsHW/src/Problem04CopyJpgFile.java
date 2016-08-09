import java.util.*;
import java.io.*;

public class Problem04CopyJpgFile {
    public static void main(String[] args) {
        try {
            FileInputStream input = new FileInputStream(new File("resources/picture.jpg"));
            FileOutputStream output = new FileOutputStream(new File("resources/my-copied-picture.jpg"));
            byte[] buffer = new byte[1024];
            int ByteLenght;
            while ((ByteLenght = input.read(buffer, 0, buffer.length)) >= 0) {
                output.write(buffer, 0, ByteLenght);
            }
            input.close();
            output.close();
        } catch (IOException error) {
            System.err.println("Cannot read/write file!");
        }
    }
}
// Useful info on Byte Buffer here: http://docs.oracle.com/javase/6/docs/api/java/io/InputStream.html#read%28byte%5b%5d%29