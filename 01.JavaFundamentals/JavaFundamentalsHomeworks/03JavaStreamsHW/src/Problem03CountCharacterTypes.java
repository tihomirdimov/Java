import java.util.*;
import java.io.*;

public class Problem03CountCharacterTypes {
    public static void main(String[] args) {
        int vowelsSum = 0;
        int consonantsSum = 0;
        int punctuationSum = 0;
        try (BufferedReader input = new BufferedReader(new FileReader("resources/words.txt"))) {
            String inputText = input.readLine();
            inputText = inputText.replace(" ", "");
            for (char character : inputText.toCharArray()) {
                if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u' ||
                        character == 'A' || character == 'E' || character == 'I' || character == 'O' || character == 'U') {
                    vowelsSum++;
                } else if (character == '!' || character == '.' || character == ',' || character == '!') {
                    punctuationSum++;
                } else {
                    consonantsSum++;
                }
            }
            input.close();
        } catch (IOException unreadable) {
            System.err.println("Cannot read file!");
        }
        try (BufferedWriter output = new BufferedWriter(new FileWriter("resources/count-chars.txt"))) {
            output.write("Vowels: " + vowelsSum + "\r\n" + "Consonants: " + consonantsSum + "\r\n" + "Punctuation: " + punctuationSum);
            output.close();
        } catch (IOException unwritable) {
            System.err.println("Cannot write file!");
        }
    }
}