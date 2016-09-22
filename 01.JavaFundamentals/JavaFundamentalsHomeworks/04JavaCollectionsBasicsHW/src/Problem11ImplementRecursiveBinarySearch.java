import java.lang.reflect.Array;
import java.util.*;

//works with unsorted arrays

public class Problem11ImplementRecursiveBinarySearch {
    public static Scanner inputNum = new Scanner(System.in);
    public static int number = inputNum.nextInt();
    public static Scanner inputArr = new Scanner(System.in);
    public static String inputString = inputArr.nextLine();
    public static String[] inputStringArray = inputString.split(" ");

    public static void main(String[] args) {
        int[] inputIntArray = createIntArray(inputStringArray);
        binarySearch(number, inputIntArray, 0, inputIntArray.length - 1);
    }

    public static int[] createIntArray(String[] inputStringArrayTemp) {
        int[] inputIntArrayTemp;
        inputIntArrayTemp = new int[inputStringArrayTemp.length];
        for (int i = 0; i < inputStringArrayTemp.length; i++) {
            inputIntArrayTemp[i] = Integer.parseInt(inputStringArrayTemp[i]);
        }
        Arrays.sort(inputIntArrayTemp);
        return inputIntArrayTemp;
    }

    public static void binarySearch(int element, int[] arrayToSearch, int min, int max) {
        int average = min + ((max - min) / 2);
        if (max < min) {
            System.out.println(-1);
        } else if (arrayToSearch[average] > element) {
            binarySearch(element, arrayToSearch, min, average - 1);
        } else if (arrayToSearch[average] < element) {
            binarySearch(element, arrayToSearch, average + 1, max);
        } else {
            searchOnTheLeft(average, arrayToSearch);
        }
    }

    public static void searchOnTheLeft(int index, int[] inputIntArrayTemp) {
        if (index == 0){
            System.out.println(0);
        }
        else if (inputIntArrayTemp[index] != inputIntArrayTemp[index - 1]) {
            System.out.println(index);
        }
        else {
            index--;
            searchOnTheLeft(index, inputIntArrayTemp);
        }
    }
}