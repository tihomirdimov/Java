import java.util.*;
import java.io.*;

public class Problem06CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputText = input.nextLine();
        String[] text = inputText.split("\\W+");
        Scanner toCompare = new Scanner(System.in);
        String inputWord = toCompare.next();
        int counter = 0;
        for (String word : text) {
            if (inputWord.equalsIgnoreCase(word)) {
                counter++;
            } else {
                continue;
            }
        }
        System.out.println(counter);
    }
}