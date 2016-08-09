import java.util.*;
import java.io.*;

public class Problem02AllCapitals {
    public static void main(String[] args) {
        ArrayList<String> textToUpper = new ArrayList<>();
        try (BufferedReader input = new BufferedReader(new FileReader("resources/lines.txt"))) {
            String line;
            while ((line = input.readLine()) != null) {
                textToUpper.add(line.toUpperCase());
            }
            input.close();
        } catch (IOException unreadble) {
            System.err.println("Cannot read file!");
        }
        try (BufferedWriter output = new BufferedWriter(new FileWriter("resources/lines.txt"))) {
            for (int i = 0; i < textToUpper.size(); i++) {
                output.write(textToUpper.get(i) + "\r\n");
            }
            output.close();
        } catch (IOException unwritable) {
            System.err.println("Cannot write file!");
        }
    }
}