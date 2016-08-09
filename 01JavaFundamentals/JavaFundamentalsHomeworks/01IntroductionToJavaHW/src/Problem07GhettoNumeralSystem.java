/**
 * Created by Tihomir on 16.3.2016 г..
 */
import java.util.Scanner;
public class Problem07GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String Number = reader.next();
        String Result = "";
        for (int i = 0; i < Number.length() ; i++) {
            switch (Number.charAt(i)){
                case '1': Result += "Bro";
                    break;
                case '2': Result += "Zuz";
                    break;
                case '3': Result += "Ma";
                    break;
                case '4': Result +="Duh";
                    break;
                case '5': Result += "Yo";
                    break;
                case '6': Result += "Dis";
                    break;
                case '7': Result += "Hood";
                    break;
                case '8': Result += "Jam";
                    break;
                case '9': Result += "Mack";
                    break;
                case '0': Result += "Gee";
                    break;
                default: System.out.println("Cannot translate to Ghetto lang");
                    break;
            }
        }
        System.out.println(Result);
    }
}