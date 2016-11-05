import java.util.*;
import java.util.regex.*;
import java.io.*;


public class Problem05ExtractWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern wordPattern = Pattern.compile("([A-Za-z]{2,})");
        Matcher match = wordPattern.matcher((text));
        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}