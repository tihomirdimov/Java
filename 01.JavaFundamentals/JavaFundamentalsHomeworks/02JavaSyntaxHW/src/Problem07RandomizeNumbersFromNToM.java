/**
 * Created by Tihomir Dimov on 20.3.2016 г..
 */
/**
 * Source https://github.com/VasilenaDragancheva
 */

import java.util.Scanner;
import java.util.*;

public class Problem07RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int start = n > m ? m : n;
        int end = n == start ? m : n;
        ArrayList<Integer> randomized = new ArrayList<Integer>();
        int count = end - start + 1;
        int index = 0;
        Random numbers = new Random();
        while (index < count) {
            int number = numbers.nextInt(count) + start;
            if (!randomized.contains(number)) {
                randomized.add(number);
                index++;
            }
        }
        System.out.println(randomized);
    }
}