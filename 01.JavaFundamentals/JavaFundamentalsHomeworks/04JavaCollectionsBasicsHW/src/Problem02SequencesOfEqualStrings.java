import java.util.*;
import java.io.*;

public class Problem02SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] inputArray = inputString.split(" ");
        for (int i = 0; i < inputArray.length; i++) {
            if (i==0){
                System.out.print(inputArray[i]);
            }
            else if (inputArray[i].equals(inputArray[i - 1])) {
                System.out.print(" " + inputArray[i]);
            } else {
                System.out.println();
                System.out.print(inputArray[i]);
            }
        }
    }
}
