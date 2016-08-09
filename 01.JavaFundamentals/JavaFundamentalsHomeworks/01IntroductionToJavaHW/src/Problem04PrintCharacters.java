/**
 * Created by Tihomir on 15.3.2016 г..
 */
public class Problem04PrintCharacters {
    public static void main(String[] args) {
        char PrintChar = (char) 0;
        for (char c = 'a' ;c <= 'z'; c++) {
            if (c != 'z') {
                System.out.print(c+" ");
            }
            else {
                System.out.print(c);
            }
        }
        }
    }