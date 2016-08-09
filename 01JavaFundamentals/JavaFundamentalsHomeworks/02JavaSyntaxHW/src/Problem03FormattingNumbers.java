/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */
import java.util.Scanner;
public class Problem03FormattingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter integer value for a");
        int numA = input.nextInt();
        System.out.println("Please enter floating point value for b");
        double numB = input.nextDouble();
        System.out.println("Please enter floating point value for c");
        double numC = input.nextDouble();
        System.out.printf("|%-10X|%s|%10.2f|%-10.3f|", numA ,String.format("%10s",Integer.toBinaryString(numA)).replace(' ', '0'), numB, numC);
    }
}
