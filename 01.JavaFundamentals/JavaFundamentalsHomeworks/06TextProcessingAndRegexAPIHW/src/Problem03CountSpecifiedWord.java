import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem03CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("[\\d\\s\\W]+");;
        String word = input.nextLine();
        int count = 0;
        for (int i=0; i<text.length; i++) {
            if (text[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}