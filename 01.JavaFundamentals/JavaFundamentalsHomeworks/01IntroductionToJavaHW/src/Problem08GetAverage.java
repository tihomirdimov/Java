/**
 * Created by Tihomir on 17.3.2016 г..
 */
import java.util.Scanner;
import java.util.Locale;
public class Problem08GetAverage {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.ENGLISH);
        System.out.println("Enter value for number a: ");
        double numA = reader.nextDouble();
        System.out.println("Enter value for number b: ");
        double numB = reader.nextDouble();
        System.out.println("Enter value for number c: ");
        double numC = reader.nextDouble();
        double average = averageNum(numA,numB,numC);
        System.out.format("Average value: %.2f", average);
    }
    private static double averageNum(double a, double b, double c){
        double result = (a+b+c) / 3;
        return result;
    }

}
