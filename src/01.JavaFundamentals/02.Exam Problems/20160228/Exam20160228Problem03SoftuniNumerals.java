import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.*;

public class Exam20160228Problem03SoftuniNumerals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                new BigInteger(new BigInteger(scanner.nextLine()
                        .replace("aba", "1")
                        .replace("bcc", "2")
                        .replace("aa", "0")
                        .replace("cdc", "4")
                        .replace("cc", "3"), 5)
                        .toString(10)));
    }
}