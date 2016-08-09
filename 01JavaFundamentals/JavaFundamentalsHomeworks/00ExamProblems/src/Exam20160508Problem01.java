import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Exam20160508Problem01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] inputStr = input.nextLine().split("\\s+");
        LinkedList<String> royalistsDB = new LinkedList<>();
        LinkedList<String> nonRoyalistsDB = new LinkedList<>();
        int royalistsNum = 0;
        int nonRoyalistsNum = 0;
        for (String str : inputStr) {
            char[] inputCh = str.toCharArray();
            int charSum = 0;
            for (char ch : inputCh) {
                if (charSum > 26) {
                    charSum -= 26;
                    charSum += ch;
                } else {
                    charSum += ch;
                }
            }
            while (charSum > 26) {
                charSum -= 26;
            }
            if (charSum == 18) {
                royalistsDB.add(str);
                royalistsNum++;
            } else {
                nonRoyalistsDB.add(str);
                nonRoyalistsNum++;
            }
        }
        if (royalistsNum >= nonRoyalistsNum) {
            System.out.printf("Royalists - %d%n", royalistsNum);
            for (String royal : royalistsDB) {
                System.out.println(royal);
            }
            System.out.println("All hail Royal!");
        } else {
            for (String nonRoyal : nonRoyalistsDB) {
                System.out.println(nonRoyal);
            }
            System.out.println("Royalism, Declined!");
        }
    }
}
