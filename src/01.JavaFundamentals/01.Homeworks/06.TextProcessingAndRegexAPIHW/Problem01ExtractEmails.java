import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Problem01ExtractEmails {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        Pattern patternString =  Pattern.compile("[a-zA-Z0-9.]+[@][a-zA-Z0-9.]+[.][a-zA-Z0-9]+");
        Matcher inputMatcher = patternString.matcher(text);
        while (inputMatcher.find()) {
            System.out.println(inputMatcher.group());
        }
    }
}