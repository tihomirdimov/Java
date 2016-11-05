/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */
import java.util.Scanner;
import java.lang.Math;
public class Problem02TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter coordinates values for point A");
        int pointAX = input.nextInt();
        int pointAY = input.nextInt();
        System.out.println("Please enter coordinates values for point B");
        int pointBX = input.nextInt();
        int pointBY = input.nextInt();
        System.out.println("Please enter coordinates values for point C");
        int pointCX = input.nextInt();
        int pointCY = input.nextInt();
        System.out.format("Rectangle area: %d", triangleArea(pointAX,pointAY,pointBX,pointBY,pointCX,pointCY));
    }
    private static int triangleArea(int AX, int AY, int BX, int BY, int CX, int CY){
        int area = Math.abs(((AX*(BY-CY)+BX*(CY-AY)+CX*(AY-BY))/2));
        return area;
    }
}