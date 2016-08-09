/**
 * Created by Tihomir Dimov on 20.3.2016 г..
 */

import java.util.*;

public class Problem09HitTheTarget {
    public static void main(String[] args) {
        System.out.println("Enter you target: ");
        Scanner input = new Scanner(System.in);
        byte target = input.nextByte();
        hitTheTarget(target);
    }

    private static void hitTheTarget(byte target) {
        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == target) {
                    System.out.printf("%s + %s = %s\n", i, j, target);
                }
                if (i - j == target) {
                    System.out.printf("%s - %s = %s\n", i, j, target);
                }
            }
        }
    }
}