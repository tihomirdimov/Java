import java.util.*;
import java.io.*;

public class Problem04CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("[\\d\\s\\W]+");
        int textLength = text.length;
        System.out.println(textLength);
    }
}