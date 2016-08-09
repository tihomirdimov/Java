/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */
import java.util.Scanner;
public class Problem01RectangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value for side A");
        int sideA = input.nextInt();
        System.out.println("Please enter value for side B");
        int sideB = input.nextInt();
        System.out.format("Rectangle area: %d", rectangleArea(sideA, sideB));
    }
    private static int rectangleArea(int sideA, int sideB){
        int area = sideA * sideB;
        return area;
    }
}
