/**
 * Created by Tihomir Dimov on 20.3.2016 г..
 */

import java.util.*;

public class Problem10CharacterMultiplier {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstString = input.next();
        String secondString = input.next();
        Long totalSumOfCharactersMultiplication = multiplyingTheCharacters(firstString, secondString);
        System.out.print(totalSumOfCharactersMultiplication);

    }

    private static Long multiplyingTheCharacters(String firstString, String secondString) {
        Long totalSum = 0L;
        for (int i = 0; i < firstString.length(); i++) {
            totalSum += firstString.charAt(i) * secondString.charAt(i);
        }
        totalSum += calculatingTheRemainder(firstString, secondString);
        return totalSum;
    }

    private static Long calculatingTheRemainder(String firstString, String secondString) {
        Long totalSumOfRemainder = 0L;
        if (firstString.length() > secondString.length()) {
            String remainder = firstString.substring(secondString.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSumOfRemainder += remainder.charAt(i);
            }
        } else if (secondString.length() > firstString.length()) {
            String remainder = secondString.substring(firstString.length());
            for (int i = 0; i < remainder.length(); i++) {
                totalSumOfRemainder += remainder.charAt(i);
            }
        }
        return totalSumOfRemainder;
    }
}
