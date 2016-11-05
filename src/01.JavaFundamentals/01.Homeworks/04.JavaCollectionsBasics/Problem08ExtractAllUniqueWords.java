import java.util.*;
import java.util.regex.*;
import java.io.*;

public class Problem08ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        Pattern regex = Pattern.compile("\\w+");
        Set<String> words = new TreeSet<String>();
        Matcher matcher = regex.matcher(input);
        while(matcher.find()){
            words.add(matcher.group());
        }
        for(String element : words){
            System.out.print(element + " ");
        }
    }
}