import java.util.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem09MostFrequentWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine().toLowerCase();

        Pattern regex = Pattern.compile("\\w+");
        Matcher matcher = regex.matcher(input);
        ArrayList<String> allWords = new ArrayList<>();

        while (matcher.find()) {
            allWords.add(matcher.group());
        }

        Map<String, Integer> result = new TreeMap<>();

        for (String word : allWords) {
            Integer count = result.get(word);
            if (count == null) {
                count = 0;
            }
            result.put(word, count + 1);
        }

        int highestCount = 0;
        for (String word : result.keySet()) {
            int count = result.get(word);
            if (count > highestCount) {
                highestCount = count;
            }
        }


        for (String word : result.keySet()) {
            int count = result.get(word);
            if (count == highestCount) {
                System.out.printf("%s -> %d times \n", word, count);
            }
        }
    }
}