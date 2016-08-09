import java.util.*;
import java.io.*;

public class Problem02SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split("\\s+");
        String order = input.nextLine();
        if (order.equalsIgnoreCase("ascending")) {
            Arrays.stream(numbers)
                    .map(a -> Integer.parseInt(a))
                    .sorted()
                    .forEach(a -> System.out.printf("%d ", a));
        }
        if (order.equalsIgnoreCase("descending")) {
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted((d1, d2) -> d2.compareTo(d1))
                    .forEach(d -> System.out.printf("%d ", d));
        }
    }
}