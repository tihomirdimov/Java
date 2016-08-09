/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */
import java.util.Scanner;
public class Problem06BaseSevenToBaseTen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberInBase7 = Integer.parseInt(input.nextLine(), 7);
        String numberInDecimal = Integer.toString(numberInBase7, 10);
        System.out.println(numberInDecimal);
    }
}
