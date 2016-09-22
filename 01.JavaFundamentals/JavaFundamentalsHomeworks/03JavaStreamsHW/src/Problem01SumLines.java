import java.util.*;
import java.io.*;

public class Problem01SumLines {
    public static void main(String[] args) {
        try (BufferedReader input = new BufferedReader(new FileReader("resources/lines.txt"))) {
            String line;
            while ((line = input.readLine()) != null) {
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
            }
            input.close();
        } catch (IOException unreadble) {
            System.err.println("Cannot read file!");
        }
    }
}