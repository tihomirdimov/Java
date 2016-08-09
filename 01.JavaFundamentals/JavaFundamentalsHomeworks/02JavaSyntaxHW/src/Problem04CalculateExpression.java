/**
 * Created by Tihomir Dimov on 19.3.2016 г..
 */

import java.util.Scanner;
import java.math.*;

public class Problem04CalculateExpression {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter value for \"a\"");
        double numA = input.nextDouble();
        System.out.println("Please enter value for \"b\"");
        double numB = input.nextDouble();
        System.out.println("Please enter value for \"c\"");
        double numC = input.nextDouble();
        double resultFormulaOne = formulaOne(numA, numB, numC);
        double resultFormulaTwo = formulaTwo(numA, numB, numC);
        double difference = Math.abs(averageResult(numA, numB, numC) - averageResult(resultFormulaOne, resultFormulaTwo));
        System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", resultFormulaOne, resultFormulaTwo, difference);
    }

    public static double formulaOne(double num1, double num2, double num3) {
        double powA = Math.pow(num1, 2);
        double powB = Math.pow(num2, 2);
        double result = java.lang.Math.pow(((powA + powB) / (powA - powB)), ((num1 + num2 + num3) / Math.sqrt(num3)));
        return result;
    }

    public static double formulaTwo(double num1, double num2, double num3) {
        double powA = Math.pow(num1, 2);
        double powB = Math.pow(num2, 2);
        double powC = Math.pow(num3, 3);
        double result = java.lang.Math.pow((powA + powB - powC), (num1 - num2));
        return result;
    }

    public static double averageResult(double num1, double num2) {
        double result = (num1 + num2) / 2;
        return result;
    }

    public static double averageResult(double num1, double num2, double num3) {
        double result = (num1 + num2 + num3) / 3;
        return result;
    }
}