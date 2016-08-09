import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.regex.*;

public class Exam20160508Problem02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] matrix = input.nextLine().split(" ");
        int rows = Integer.parseInt(matrix[0]);
        int cols = Integer.parseInt(matrix[1]);
        String[] prices = input.nextLine().split(" ");
        BigDecimal lukankaPrice = new BigDecimal(prices[0]);
        BigDecimal rakiaPrice = new BigDecimal(prices[1]);
        BigDecimal currentPurchase = BigDecimal.ZERO;
        BigDecimal totalPurchases = BigDecimal.ZERO;
        int customers = 0;
        String inputLine = input.nextLine();
        while (!inputLine.equals("Royal Close")) {
            String[] clients = inputLine.split(" ");
            int clientStartRow = Integer.parseInt(clients[0]);
            int clientStartCol = Integer.parseInt(clients[1]);
            clientStartRow++;
            clientStartCol++;
            if (clientStartRow < clientStartCol) {
                currentPurchase = moveUp(clientStartRow, clientStartCol, rows, cols, lukankaPrice, rakiaPrice);
            } else {
                currentPurchase = moveLeft(clientStartRow, clientStartCol, rows, cols, lukankaPrice, rakiaPrice);
            }
            totalPurchases = totalPurchases.add(currentPurchase);
            customers++;
            inputLine = input.nextLine();
        }
        System.out.println(String.format("%.6f", totalPurchases));
        System.out.println(customers);
    }

    public static BigDecimal moveUp(int row, int col, int rowNo, int colNo, BigDecimal lukanka, BigDecimal rakia) {
        BigDecimal totalSpent = BigDecimal.ZERO;
        while (row != 0) {
            BigDecimal purchaseAtCell = purchase(row, col, lukanka, rakia);
            totalSpent = totalSpent.add(purchaseAtCell);
            row--;
        }
        row++;
        if (row == 1 && col > 1) {
            totalSpent = totalSpent.add(moveLeft(row, col-1, rowNo, colNo, lukanka, rakia));
            return totalSpent;
        } else {
            return totalSpent;
        }
    }

    public static BigDecimal moveLeft(int row, int col, int rowNo, int colNo, BigDecimal lukanka, BigDecimal rakia) {
        BigDecimal totalSpent = BigDecimal.ZERO;
        while (col != 0) {
            BigDecimal purchaseAtCell = purchase(row, col, lukanka, rakia);
            totalSpent = totalSpent.add(purchaseAtCell);
            col--;
        }
        col++;
        if (row > 1 && col == 1) {
            totalSpent = totalSpent.add(moveUp(row-1, col, rowNo, colNo, lukanka, rakia));
            return totalSpent;
        } else {
            return totalSpent;
        }
    }

    public static BigDecimal purchase(int row, int col, BigDecimal lukanka, BigDecimal rakia) {
        BigDecimal purchase = BigDecimal.ZERO;
        if (row == 1 && col == 1) {
            return purchase;
        } else {
            if ((row+1) % 2 == 0) {
                purchase = lukanka.multiply(BigDecimal.valueOf(row * col));
            } else {
                purchase = rakia.multiply(BigDecimal.valueOf(row * col));
            }
            return purchase;
        }
    }
}