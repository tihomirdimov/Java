import java.util.*;
import java.io.*;

public class Problem04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.nextLine();
        String[] inputArray = inputString.split(" ");
        int[] inputIntArray = new int[inputArray.length];
        for (int i = 0; i < inputIntArray.length; i++) {
            inputIntArray[i] = Integer.parseInt(inputArray[i]);
        }
        int longestSeq = 1;
        int longestIndex = 0;
        int tempSeq = 1;
        int tempIndex = 0;
        System.out.printf("%d", inputIntArray[0]);
        for (int i = 1; i < inputIntArray.length; i++) {
            if (inputIntArray[i] > inputIntArray[i - 1]) {
                System.out.printf(" %d", inputIntArray[i]);
                tempSeq++;
                if (tempSeq > longestSeq) {
                    longestSeq = tempSeq;
                    longestIndex = i;
                }
            } else {
                System.out.printf("%n%d", inputIntArray[i]);
                tempSeq = 1;
            }
        }
        System.out.printf("%nLongest: ");
        for (int i = (longestIndex - longestSeq + 1); i <=longestIndex; i++) {
            System.out.print(inputIntArray[i]+" ");
        }
    }
}