import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Problem06StartsAndEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern wordPattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher match = wordPattern.matcher(text);
        while (match.find()) {
            System.out.print(match.group() + " ");
        }
    }
}