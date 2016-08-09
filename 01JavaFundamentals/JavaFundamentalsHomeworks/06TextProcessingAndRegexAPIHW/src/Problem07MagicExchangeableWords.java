import java.io.*;
import java.util.*;
import java.util.HashMap;

public class Problem07MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stringsToCompare = input.nextLine().split(" ");
        String firstString = stringsToCompare[0];
        String secondString = stringsToCompare[1];
        System.out.println(isEqual(firstString, secondString));
    }

    private static boolean isEqual(String firstStr, String secondStr) {
        boolean equality = true;
        if (firstStr.length() != secondStr.length()) {
            equality = false;
        } else {
            HashMap<Character, Character> letters = new HashMap<>();
            for (int i = 0; i < firstStr.length(); i++) {
                char firstChar = firstStr.charAt(i);
                char secondChar = secondStr.charAt(i);
                if (!letters.containsKey(firstChar)) {
                    letters.put(firstChar, secondChar);
                } else {
                    if (letters.get(firstChar) != secondChar) {
                        equality = false;
                    } else {
                        equality = true;
                    }
                }
            }
        }
        return equality;
    }
}