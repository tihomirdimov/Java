import java.util.*;
import java.io.*;

public class Problem01SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arrayLenght = input.nextInt();
        int[] numbers = new int[arrayLenght];
        int value;
        for (int i = 0; i < numbers.length; i++) {
            value = input.nextInt();
            numbers[i] = value;
        }
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}