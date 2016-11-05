import java.util.*;
import java.io.*;

public class Problem03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] inputArray = inputString.split(" ");
        int longestSequenceCounter = 1;
        String longestSequenceString = inputArray[0];
        int tempSequenceCounter = 1;
        String tempSequenceString = longestSequenceString;
        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i].equals(inputArray[i - 1])) {
                tempSequenceCounter++;
                if (tempSequenceCounter > longestSequenceCounter) {
                    longestSequenceCounter = tempSequenceCounter;
                    longestSequenceString = inputArray[i];
                }
            } else {
                tempSequenceCounter = 1;
                tempSequenceString = inputArray[i];
            }
        }
        for (int j = 0; j < longestSequenceCounter; j++) {
            System.out.print(longestSequenceString + " ");
        }
    }
}