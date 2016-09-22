import java.util.*;
import java.io.*;

public class Problem05CountAllWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] inputArray = inputString.split("\\W+");
        System.out.println(inputArray.length);
    }
}