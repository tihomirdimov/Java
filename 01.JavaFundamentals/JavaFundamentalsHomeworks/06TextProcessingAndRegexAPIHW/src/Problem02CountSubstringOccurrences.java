import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem02CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String subText = input.nextLine();
        int subTextLength = subText.length();
        int counter = 0;
        for (int i = 0; i <= text.length() - subTextLength; i++) {
            if (subText.equalsIgnoreCase(text.substring(i, subTextLength + i))) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}