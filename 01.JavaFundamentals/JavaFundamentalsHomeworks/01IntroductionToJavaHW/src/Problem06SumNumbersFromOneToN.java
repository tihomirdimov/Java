/**
 * Created by Tihomir on 16.3.2016 г..
 */
import java.util.Scanner;
public class Problem06SumNumbersFromOneToN {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer input= reader.nextInt();
        Integer result = 0;
        for (int i = 1; i <=input; i++) {
            result+=i;
        }
        System.out.println(result);
    }
}
