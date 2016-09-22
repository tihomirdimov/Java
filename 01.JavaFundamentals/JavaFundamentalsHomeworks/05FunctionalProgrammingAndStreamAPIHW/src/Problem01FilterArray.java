import java.util.*;
import java.io.*;

public class Problem01FilterArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] text = input.nextLine().split("\\s+");
        Arrays.stream(text).filter(p -> p.length() > 3)
                .forEach(p -> System.out.printf("%s ", p));
    }
}