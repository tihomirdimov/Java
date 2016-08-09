import java.util.*;
import java.io.*;

public class Problem12CalculateNFactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberN = input.nextInt();
        int factorial = calculateFactorial(numberN);
        System.out.println(factorial);
    }
    public static int calculateFactorial(int number){
        int factorial = 0;
        if (number == 0){
            return 1;
        }
        else{
            return number*calculateFactorial(number-1);
        }
    }
}