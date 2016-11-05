/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */
import java.util.Scanner;
public class Problem05BaseTenToBaseSeven {
    public static void main(String[] args) {
        System.out.println("Enter the number you want to convert to 7 base: ");
        Scanner input = new Scanner(System.in);
        Integer numberToConvert = input.nextInt();
        System.out.print(Integer.toString(numberToConvert, 7));
    }
}
